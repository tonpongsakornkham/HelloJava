package com.example.callapi.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {
    Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(CallApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public CallApi getCallApi() {
        return retrofit.create(CallApi.class);
    }
}
