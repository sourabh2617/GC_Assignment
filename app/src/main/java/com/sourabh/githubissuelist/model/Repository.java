package com.sourabh.githubissuelist.model;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.lifecycle.MutableLiveData;

import com.sourabh.githubissuelist.network.Api;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository extends BaseObservable {
    private MutableLiveData<List<GitIssue>> gitIssuesList = new MutableLiveData<>();

    public MutableLiveData<List<GitIssue>> getGitIssueList() {
        return gitIssuesList;
    }

    public void fetchList() {
        Callback<List<GitIssue>> callback = new Callback<List<GitIssue>>() {
            @Override
            public void onResponse(Call<List<GitIssue>> call, Response<List<GitIssue>> response) {
                List<GitIssue> body = response.body();
                gitIssuesList.setValue(body);
            }

            @Override
            public void onFailure(Call<List<GitIssue>> call, Throwable t) {
                Log.e("Test", t.getMessage(), t);
            }
        };
        Api.getApi().getGitIssuesApi().enqueue(callback);
    }
}
