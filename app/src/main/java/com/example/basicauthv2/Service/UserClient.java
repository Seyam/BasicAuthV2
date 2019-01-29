package com.example.basicauthv2.Service;

import com.example.basicauthv2.Model.User;
import com.example.basicauthv2.Model.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserClient {
    @POST("edit")
    Call<User> sendPost(@Body User user);

    @FormUrlEncoded
    @POST("edit")
    Call<UserResponse>  sendPostAsFormUrlEncoded(
            @Field("device_no") String device_no,
            @Field("temperature") String temperature
    );

    @POST("login")
    Call<UserResponse> sendPostAsBasicAuthentication(@Header("Authorization") String authHeader);
}
