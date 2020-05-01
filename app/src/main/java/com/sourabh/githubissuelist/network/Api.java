package com.sourabh.githubissuelist.network;

import com.sourabh.githubissuelist.model.GitIssue;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class Api {

    private static ApiInterface apiInterface;
    private static final String BASE_URL = "https://api.github.com/";

    public static ApiInterface getApiInterface() {
        if (apiInterface == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .build();


            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            apiInterface = retrofit.create(ApiInterface.class);
        }
        return apiInterface;
    }

    public interface ApiInterface {
        @GET("repos/firebase/firebase-ios-sdk/issues")
        Call<List<GitIssue>> getGitIssuesApi();


    }
}