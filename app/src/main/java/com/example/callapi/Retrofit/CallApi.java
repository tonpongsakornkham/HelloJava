package com.example.callapi.Retrofit;

import com.example.callapi.model.DataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface CallApi {

    String BASE_URL = "https://api.jsonbin.io/";

    @Headers("secret-key:" + "$2b$10$wup2Y0uYiB5bJQII62xy4u.OG3LkaTA5TvaYxZWBIpKi6kEsSsDWu")
    @GET("b/5ece36edd7f1581464c65dea")
    Call<List<DataModel>> getDatas();
}
