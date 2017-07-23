package com.corfoarte.victorcastro.corpoarte.io;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Victor Castro on 15/07/2017.
 */

public class ApiAdapter {


    private static ServiceApi API_SERVICE;

    public static ServiceApi getApiService() {

// Creating the interceptor, and setting the log level
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        // add logging as last interceptor
        httpClient.addInterceptor(logging);

        String baseUrl = "https://apifestigaita.herokuapp.com/api/v1/";

        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build()) // <-- using the log level
                    .build();
            API_SERVICE = retrofit.create(ServiceApi.class);
        }

        return API_SERVICE;
    }
}
