package com.cleanmvvm.di

import com.cleanmvvm.BuildConfig
import com.cleanmvvm.datasource.remote.SampleApi
import com.cleanmvvm.network.createNetworkClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit

fun injectFeature() = loadFeature

private val loadFeature by lazy {
    loadKoinModules(
        viewModelModule, useCaseModule,
        repositoryModule,
        dataSourceModule,
        networkModule,
        cacheModule
    )
}

val viewModelModule: Module = module {
    //    viewModel { }
}

val cacheModule: Module = module {
    single { }
}

val repositoryModule: Module = module {
    single { }
}

val networkModule: Module = module {
    single { articlesApi }
}

val useCaseModule: Module = module {
    factory { }
}

private const val BASE_URL = "https://api.github.com/"
private val retrofit: Retrofit = createNetworkClient(BASE_URL, BuildConfig.DEBUG)
private val articlesApi: SampleApi = retrofit.create(SampleApi::class.java)
