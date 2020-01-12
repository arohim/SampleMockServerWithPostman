package com.cleanmvvm.di

import com.cleanmvvm.datasource.cache.ArticleCacheDataSourceImpl
import com.cleanmvvm.datasource.cache.ArticleMemory
import com.cleanmvvm.datasource.remote.FakeArticleRemoteDataSourceImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val dataSourceModule: Module = module {
    single { }
    single { }
}
