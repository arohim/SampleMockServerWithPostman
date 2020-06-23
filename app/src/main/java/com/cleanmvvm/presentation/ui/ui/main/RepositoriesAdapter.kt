package com.cleanmvvm.presentation.ui.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.cleanmvvm.databinding.ItemGithubRepositoryBinding
import com.cleanmvvm.datasource.model.GitHubRepository

class GitHubRepositoryAdapter :
    ListAdapter<GitHubRepository, GitHubRepositoryAdapter.ViewHolder>(GitHubRepositoryDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(
            ItemGithubRepositoryBinding.inflate(
                layoutInflater,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(private val binding: ItemGithubRepositoryBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: GitHubRepository) {
            binding.name = item.name
            binding.desc = item.description
        }
    }
}

private class GitHubRepositoryDiffCallback : DiffUtil.ItemCallback<GitHubRepository>() {
    override fun areItemsTheSame(oldItem: GitHubRepository, newItem: GitHubRepository): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: GitHubRepository, newItem: GitHubRepository): Boolean {
        return oldItem == newItem
    }
}
