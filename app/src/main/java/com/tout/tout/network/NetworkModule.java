package com.tout.tout.network;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkModule {

    private Retrofit retrofit;

    public NetworkModule() {
        final HttpLoggingInterceptor.Logger logger = new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.e("OkHttp", message);
            }
        };
        final HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(logger) //
                .setLevel(HttpLoggingInterceptor.Level.HEADERS);
        final OkHttpClient client = new OkHttpClient.Builder() //
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build();


        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.urbandictionary.com/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public UrbanApi service() {
        return retrofit.create(UrbanApi.class);
    }

}
