package com.cleanmvvm.datasource.remote

import io.reactivex.Single
import retrofit2.http.GET

interface SampleApi {

    @GET("sample/sample")
    fun getSample(): Single<Any>

}
