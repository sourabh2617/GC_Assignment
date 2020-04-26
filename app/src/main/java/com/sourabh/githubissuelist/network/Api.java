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

    private static ApiInterface api;
    private static final String BASE_URL = "https://api.github.com/";

    public static ApiInterface getApi() {
        if (api == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .build();

//            Gson gson = new GsonBuilder()
//                    .registerTypeAdapter(
//                            GitIssues.class,
//                            new JsonDogBreedsDeserializer())
//                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    //                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            api = retrofit.create(ApiInterface.class);
        }
        return api;
    }

    public interface ApiInterface {
        @GET("repos/firebase/firebase-ios-sdk/issues")
        Call<List<GitIssue>> getGitIssuesApi();

//        @GET("/api/breed/{breed}/images")
//        Call<DogBreedImages> getImagesByBreed(@Path("breed") String breed);

    }
}