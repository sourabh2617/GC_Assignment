package com.sourabh.githubissuelist.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.sourabh.githubissuelist.BR;
import com.sourabh.githubissuelist.R;
import com.sourabh.githubissuelist.databinding.ViewGitItemBinding;
import com.sourabh.githubissuelist.model.GitIssue;
import com.sourabh.githubissuelist.viewmodel.HomeScreenViewModel;

import java.util.List;

public class GitIssuesAdapter extends RecyclerView.Adapter<GitIssuesAdapter.GenericViewHolder>{

    private int layoutId;
    private List<GitIssue> gitIssueList;
    private HomeScreenViewModel viewModel;

    public GitIssuesAdapter(@LayoutRes int view_git_item, HomeScreenViewModel homeScreenViewModel) {
    layoutId= view_git_item;
    viewModel = homeScreenViewModel;
    }

    public void setGitIssueList(List<GitIssue> gitIssueList) {
        this.gitIssueList = gitIssueList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public GitIssuesAdapter.GenericViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewGitItemBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.view_git_item, parent, false);
        return new GenericViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull GitIssuesAdapter.GenericViewHolder holder, int position) {
        holder.bind(viewModel, position);
    }

    @Override
    public int getItemCount() {
        return gitIssueList == null ? 0 : gitIssueList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return getLayoutIdForPosition(position);
    }

    private int getLayoutIdForPosition(int position) {
        return layoutId;
    }

    static class GenericViewHolder extends RecyclerView.ViewHolder {
        final ViewGitItemBinding binding;

        GenericViewHolder(ViewGitItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(HomeScreenViewModel viewModel, Integer position) {
            binding.setViewModel(viewModel);
            binding.setPosition(position);
            binding.executePendingBindings();
        }

    }
}
