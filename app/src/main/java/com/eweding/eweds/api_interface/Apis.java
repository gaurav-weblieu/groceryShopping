package com.eweding.eweds.api_interface;

import com.eweding.eweds.Pojo.ServiceModels;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Apis {

    @FormUrlEncoded
    @POST("getServices")
    Call<ServiceModels> getServices(
            @Field("phone") String phone
    );



}
