package com.androidmani.daggerretrofitex.interfaces;

import com.androidmani.daggerretrofitex.model.User;
import com.androidmani.daggerretrofitex.model.UsersModel;

import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface RetrofitApiService {

    //ex: api/users?
    @GET("api/users?")
    Call<UsersModel> getAllUser();

//    //ex: api/1/users
//    @GET("api/{id}/users")
//    Call<List<User>> groupList2(@Path("id") int groupId);
//
//    //ex: api/1/users
//    @GET("api/{id}/users")
//    Call<List<User>> groupList1(@Path("id") int groupId);
//
//    //ex: api/1/users?sort
//    @GET("api/{id}/users")
//    Call<List<User>> groupList(@Path("id") int groupId, @Query("sort") String sort);
//
//    //Passing multiple query params
//    @GET("group/{id}/users")
//    Call<List<User>> groupList(@Path("id") int groupId, @QueryMap Map<String, String> options);
//
//    //Request body
//    @POST("users/new")
//    Call<User> createUser(@Body User user);
//
//    //FORM ENCODED AND MULTIPART
//    @FormUrlEncoded
//    @POST("user/edit")
//    Call<User> updateUser(@Field("first_name") String first, @Field("last_name") String last);
//
//    //Multipart form data
//    @Multipart
//    @PUT("user/photo")
//    Call<User> updateUser(@Part("photo") RequestBody photo, @Part("description") RequestBody description);
//
//    //Single Header passing
//    @Headers("Cache-Control: max-age=640000")
//    @GET("widget/list")
//    Call<UsersModel> getAllUser2();
//
//    //Multiple Headers passing
//    @Headers({
//            "Accept: application/vnd.github.v3.full+json",
//            "User-Agent: Retrofit-Sample-App"
//    })
//    @GET("users/{username}")
//    Call<User> getUser1(@Path("username") String username);
//
//    //Dynamic header passing @Header annotation
//    @GET("user")
//    Call<User> getUser(@Header("Authorization") String authorization)
//
//    //Dynamic multiple headers passing using @HeaderMap annotation
//    @GET("user")
//    Call<User> getUser(@HeaderMap Map<String, String> headers);


}

