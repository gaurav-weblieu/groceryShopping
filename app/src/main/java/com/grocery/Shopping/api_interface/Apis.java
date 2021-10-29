package com.grocery.Shopping.api_interface;

import com.grocery.Shopping.Pojo.ServiceModels;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Apis {

    @FormUrlEncoded
    @POST("getServices")
    Call<ServiceModels> getServices(
            @Field("phone") String phone
    );



}
