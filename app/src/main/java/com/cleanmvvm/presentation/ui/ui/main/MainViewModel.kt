package com.cleanmvvm.presentation.ui.ui.main

import androidx.lifecycle.*
import com.cleanmvvm.datasource.model.GitHubRepository
import com.cleanmvvm.datasource.remote.GitHubRepositoriesApi
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel constructor(
    private val gitHubRepositoriesApi: GitHubRepositoriesApi
) : ViewModel() {

    val data: MutableLiveData<List<GitHubRepository>> = MutableLiveData()
    val handler = CoroutineExceptionHandler { _, exception -> }

    init {
        viewModelScope.launch(handler) {
            withContext(Dispatchers.IO) {
                val retrievedData = gitHubRepositoriesApi.getRepositories()
                val values: List<GitHubRepository>? = retrievedData.body()
                data.postValue(values)
            }
        }
    }

}
