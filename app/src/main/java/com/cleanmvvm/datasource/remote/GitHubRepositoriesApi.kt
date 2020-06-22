package com.cleanmvvm.datasource.remote

import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface GitHubRepositoriesApi {

    @GET("/repositories")
    suspend fun getRepositories(): Response<String>

}
