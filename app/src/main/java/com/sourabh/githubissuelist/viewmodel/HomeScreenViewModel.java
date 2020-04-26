package com.sourabh.githubissuelist.viewmodel;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.AndroidViewModel;
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
        GitIssue db = getDogBreedAt(index);
        selected.setValue(db);
    }

    public GitIssue getDogBreedAt(Integer index) {
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

//    public void fetchDogBreedImagesAt(Integer index) {
//        GitIssue dogBreed = getDogBreedAt(index);
//        if (dogBreed != null && !images.containsKey(dogBreed.getBreed())) {
//            dogBreed.fetchImages(new DogImagesCallback(dogBreed.getBreed()) {
//                @Override
//                public void onResponse(Call<DogBreedImages> call, Response<DogBreedImages> response) {
//                    DogBreedImages body = response.body();
//                    if (body.getImages() != null && body.getImages().length > 0) {
//                        String thumbnailUrl = body.getImages()[0];
//                        images.put(getBreed(), thumbnailUrl);
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<DogBreedImages> call, Throwable t) {
//                    Log.e("Test", t.getMessage(), t);
//                }
//            });
//        }
//    }
}
