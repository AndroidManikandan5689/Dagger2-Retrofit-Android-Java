package com.androidmani.daggerretrofitex.dependencies.module;

import com.androidmani.daggerretrofitex.interfaces.RetrofitApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        return new Retrofit.Builder().baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    RetrofitApiService provideRetrofitApiService(Retrofit retrofit) {
        return retrofit.create(RetrofitApiService.class);
    }

}
