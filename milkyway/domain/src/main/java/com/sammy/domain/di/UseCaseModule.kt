package com.sammy.domain.di

import com.sammy.domain.repository.SearchRepository
import com.sammy.domain.use_case.SearchGalaxies
import com.sammy.domain.use_case.SearchUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(ViewModelComponent::class)
@Module
object UseCaseModule {

    @ViewModelScoped
    @Provides
    fun provideSearchUseCases(
        repository: SearchRepository
    ): SearchUseCases {
        return SearchUseCases(
            searchGalaxiesUseCase = SearchGalaxies(repository)
        )
    }
}