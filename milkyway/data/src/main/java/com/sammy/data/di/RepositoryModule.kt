package com.sammy.data.di

import com.sammy.data.data.repository.SearchRepositoryImpl
import com.sammy.domain.repository.SearchRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {
    @Binds
    abstract fun provideSearchRepository(impl: SearchRepositoryImpl): SearchRepository
}