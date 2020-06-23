package com.cleanmvvm.presentation.ui.ui.main

import androidx.lifecycle.*
import com.cleanmvvm.datasource.model.GitHubRepository
import com.cleanmvvm.datasource.remote.GitHubRepositoriesApi
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Exception

class MainViewModel constructor(
    private val gitHubRepositoriesApi: GitHubRepositoriesApi
) : ViewModel() {

    val data: MutableLiveData<List<GitHubRepository>?> = MutableLiveData()

    val error = MutableLiveData<String>()

    private val handler = CoroutineExceptionHandler { _, exception ->
        error.value = exception.message
    }

    init {
        viewModelScope.launch(handler) {
            withContext(Dispatchers.IO) {
                try {
                    val retrievedData = gitHubRepositoriesApi.getRepositories()
                    if (retrievedData.isSuccessful) {
                        val values: List<GitHubRepository>? = retrievedData.body()
                        data.postValue(values)
                    } else {
                        error.postValue(retrievedData.message())
                    }
                } catch (e: Exception) {
                    error.postValue(e.message)
                }
            }
        }
    }

}
