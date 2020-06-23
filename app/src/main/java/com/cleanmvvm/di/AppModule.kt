package com.cleanmvvm.di

import com.cleanmvvm.BuildConfig
import com.cleanmvvm.datasource.remote.GitHubRepositoriesApi
import com.cleanmvvm.network.createNetworkClient
import com.cleanmvvm.presentation.ui.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit

fun injectFeature() = loadFeature

private val loadFeature by lazy {
    loadKoinModules(
        viewModelModule,
        repositoryModule,
        dataSourceModule,
        networkModule
    )
}

val viewModelModule: Module = module {
    viewModel { MainViewModel(get()) }
}


val repositoryModule: Module = module {
    single { }
}

val networkModule: Module = module {
    single { GITHUB_REPOSITORIES_API }
}

val dataSourceModule: Module = module {
}

private val retrofit: Retrofit = createNetworkClient(BuildConfig.BASE_API_URL, BuildConfig.DEBUG)
private val GITHUB_REPOSITORIES_API: GitHubRepositoriesApi = retrofit.create(GitHubRepositoriesApi::class.java)
