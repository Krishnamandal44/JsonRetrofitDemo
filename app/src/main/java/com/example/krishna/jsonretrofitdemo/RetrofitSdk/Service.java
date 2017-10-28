package com.example.krishna.jsonretrofitdemo.RetrofitSdk;

import com.example.krishna.jsonretrofitdemo.RetrofitSdk.Responce.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by pc41 on 28-10-2017.
 */

public interface Service {
    @GET("/bins/vnvxd")
    Call<Example>getExampleCall();
}
