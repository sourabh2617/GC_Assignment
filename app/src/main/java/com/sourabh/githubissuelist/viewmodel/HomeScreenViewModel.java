package com.sourabh.githubissuelist.viewmodel;

import android.view.View;

import androidx.databinding.ObservableInt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sourabh.githubissuelist.R;
import com.sourabh.githubissuelist.adapter.GitIssuesAdapter;
import com.sourabh.githubissuelist.model.GitIssue;
import com.sourabh.githubissuelist.model.Repository;

import java.util.List;

public class HomeScreenViewModel extends ViewModel {
    private Repository repository;
    private GitIssuesAdapter adapter;
    public MutableLiveData<GitIssue> selected;

    public ObservableInt loading;
    public ObservableInt showEmpty;

    public void init() {
        repository = new Repository();
        selected = new MutableLiveData<>();
        adapter = new GitIssuesAdapter(R.layout.view_git_item, this);
        loading = new ObservableInt(View.GONE);
        showEmpty = new ObservableInt(View.GONE);
    }

    public void onItemClick(Integer index) {
        GitIssue db = getGitIssueAt(index);
        selected.setValue(db);
    }

    public GitIssue getGitIssueAt(Integer index) {
        if (repository.getGitIssueList().getValue() != null &&
                index != null &&
                repository.getGitIssueList().getValue().size() > index) {
            return repository.getGitIssueList().getValue().get(index);
        }
        return null;
    }
    public void fetchList() {
        repository.fetchList();
    }

    public GitIssuesAdapter getAdapter() {
        return adapter;
    }

    public void setGitIssuesInAdapter(List<GitIssue> gitIssues) {
        adapter.setGitIssueList(gitIssues);
        adapter.notifyDataSetChanged();
    }

    public MutableLiveData<GitIssue> getSelected() {
        return selected;
    }

    public MutableLiveData<List<GitIssue>> getGitIssuesList() {
        return repository.getGitIssueList();
    }

}
