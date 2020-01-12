package com.cleanmvvm.di

import com.cleanmvvm.data.datasource.ArticleCacheDataSource
import com.cleanmvvm.data.datasource.ArticleRemoteDataSource
import org.koin.core.module.Module
import org.koin.dsl.module

val dataSourceModule: Module = module {
    single { ArticleRemoteDataSourceImpl(api = get()) as ArticleRemoteDataSource }
    single { ArticleCacheDataSourceImpl(cache = ArticleDatabase.getInstance(get()).articleDao()) as ArticleCacheDataSource }
}
