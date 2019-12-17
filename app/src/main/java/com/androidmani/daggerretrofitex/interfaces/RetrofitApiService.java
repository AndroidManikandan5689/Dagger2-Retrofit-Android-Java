package com.androidmani.daggerretrofitex.interfaces;

import com.androidmani.daggerretrofitex.model.User;
import com.androidmani.daggerretrofitex.model.UsersModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiService {

    @GET("api/users")
    Call<UsersModel> getAllUser();
}
