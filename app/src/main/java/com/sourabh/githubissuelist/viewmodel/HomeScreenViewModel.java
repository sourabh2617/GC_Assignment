package com.sourabh.githubissuelist.viewmodel;

import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sourabh.githubissuelist.adapter.GitIssuesAdapter;
import com.sourabh.githubissuelist.model.GitIssue;
import com.sourabh.githubissuelist.model.GitIssues;

public class HomeScreenViewModel extends ViewModel {
    private GitIssues dogBreeds;
    private GitIssuesAdapter adapter;
    public MutableLiveData<GitIssue> selected;
    public ObservableArrayMap<String, String> images;
    public ObservableInt loading;
    public ObservableInt showEmpty;
}
