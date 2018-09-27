package com.tout.tout.network;

import com.tout.tout.entities.urban.MyResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UrbanApi {
    @GET("/v0/random")
    Call<MyResponse> getUrbanRandom();
}
