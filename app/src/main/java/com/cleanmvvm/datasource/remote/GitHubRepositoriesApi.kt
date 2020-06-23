package com.cleanmvvm.datasource.remote

import com.cleanmvvm.datasource.model.GitHubRepository
import retrofit2.Response
import retrofit2.http.GET

interface GitHubRepositoriesApi {

    @GET("/repositories")
    suspend fun getRepositories(): Response<List<GitHubRepository>>

}
