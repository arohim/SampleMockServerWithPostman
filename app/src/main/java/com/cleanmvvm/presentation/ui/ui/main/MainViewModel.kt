package com.cleanmvvm.presentation.ui.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.cleanmvvm.datasource.model.GitHubRepository
import com.cleanmvvm.datasource.remote.GitHubRepositoriesApi
import kotlinx.coroutines.Dispatchers

class MainViewModel constructor(
    val gitHubRepositoriesApi: GitHubRepositoriesApi
) : ViewModel() {

    val data: LiveData<List<GitHubRepository>?> = liveData(Dispatchers.IO) {
        val retrievedData = gitHubRepositoriesApi.getRepositories()
        val values: List<GitHubRepository>? = retrievedData.body()
        emit(values)
    }

}
