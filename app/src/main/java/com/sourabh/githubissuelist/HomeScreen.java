package com.sourabh.githubissuelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.sourabh.githubissuelist.databinding.ActivityMainBinding;
import com.sourabh.githubissuelist.model.GitIssue;
import com.sourabh.githubissuelist.viewmodel.HomeScreenViewModel;
import java.util.List;

public class HomeScreen extends AppCompatActivity {
    private HomeScreenViewModel homeScreenViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupBindings(savedInstanceState);
    }


    private void setupBindings(Bundle savedInstanceState) {
        ActivityMainBinding activityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        homeScreenViewModel  = new ViewModelProvider(this).get(HomeScreenViewModel.class);

        RecyclerView recyclerView = activityBinding.listOfBreeds;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        if (savedInstanceState == null) {
            homeScreenViewModel.init();
        }
        activityBinding.setModel(homeScreenViewModel);
        setupListUpdate();
    }

    private void setupListUpdate() {
        homeScreenViewModel.loading.set(View.VISIBLE);
        homeScreenViewModel.fetchList();
        homeScreenViewModel.getGitIssuesList().observe(this, new Observer<List<GitIssue>>() {
            @Override
            public void onChanged(List<GitIssue> gitIssues) {
                homeScreenViewModel.loading.set(View.GONE);
                if (gitIssues.size() == 0) {
                    homeScreenViewModel.showEmpty.set(View.VISIBLE);
                } else {
                    homeScreenViewModel.showEmpty.set(View.GONE);
                    homeScreenViewModel.setGitIssuesInAdapter(gitIssues);
                }
            }
        });
        setupListClick();
    }

    private void setupListClick() {
        homeScreenViewModel.getSelected().observe(this, new Observer<GitIssue>() {
            @Override
            public void onChanged(GitIssue gitIssue) {
                if (gitIssue != null) {
                    Toast.makeText(HomeScreen.this, "You selected a " +gitIssue.getBody(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
