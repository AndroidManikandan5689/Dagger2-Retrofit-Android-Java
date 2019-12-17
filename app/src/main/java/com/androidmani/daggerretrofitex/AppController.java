package com.androidmani.daggerretrofitex;

import android.app.Application;

import com.androidmani.daggerretrofitex.dependencies.component.AppComponent;
import com.androidmani.daggerretrofitex.dependencies.component.DaggerAppComponent;
import com.androidmani.daggerretrofitex.dependencies.module.AppModule;
import com.androidmani.daggerretrofitex.dependencies.module.NetworkModule;

public class AppController extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .networkModule(new NetworkModule())
                .appModule(new AppModule(this)) //Set application module
                .build();
    }

    public static AppComponent getAppComponent()
    {
        return appComponent;
    }
}
