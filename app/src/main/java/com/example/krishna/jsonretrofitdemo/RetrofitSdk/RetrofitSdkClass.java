package com.example.krishna.jsonretrofitdemo.RetrofitSdk;

import android.content.Context;

import com.example.krishna.jsonretrofitdemo.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pc41 on 28-10-2017.
 */

public class RetrofitSdkClass {
    private final Retrofit retrofit;
    private Service service;

    private RetrofitSdkClass(Retrofit retrofit) {
        this.retrofit = retrofit;
        createService();
    }

    /**
     * Builder for {@link RetrofitSdkClass}
     */
    public static class Builder {
        public Builder() {
        }
        /**
         * Create the {@link RetrofitSdkClass} to be used.
         *
         * @return {@link RetrofitSdkClass}
         */
        public RetrofitSdkClass
        build(Context context) {
            Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(context.getResources().getString(R.string.base_url))
                    .build();

            return new RetrofitSdkClass(retrofit);
        }
    }

    private void createService() {
        service = retrofit.create(Service.class);
    }

    public Service getService(){
        return service;
    }
}


