package com.sourabh.githubissuelist.model;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GitIssues extends BaseObservable {
    private String status;
    private List<GitIssue> issueArrayList = new ArrayList<>();
    private MutableLiveData<List<GitIssue>> breeds = new MutableLiveData<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addBreed(GitIssue bd) {
        issueArrayList.add(bd);
    }

    public MutableLiveData<List<GitIssue>> getBreeds() {
        return breeds;
    }

    public void fetchList() {
        Callback<GitIssues> callback = new Callback<GitIssues>() {
            @Override
            public void onResponse(Call<GitIssues> call, Response<GitIssues> response) {
                GitIssues body = response.body();
                status = body.status;
                breeds.setValue(body.issueArrayList);
            }

            @Override
            public void onFailure(Call<GitIssues> call, Throwable t) {
                Log.e("Test", t.getMessage(), t);
            }
        };

//        Api.getApi().getBreeds().enqueue(callback);
    }
}
