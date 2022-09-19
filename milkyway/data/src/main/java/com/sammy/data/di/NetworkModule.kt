package com.sammy.data.di

import com.sammy.data.data.network.NasaApi
import com.sammy.data.data.repository.SearchRepositoryImpl
import com.sammy.domain.repository.SearchRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    private val BASE_URL = "https://images-api.nasa.gov/search/"

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                }
            )
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(client: OkHttpClient): NasaApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(client)
            .build()
            .create(NasaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideSearchRepository(apiService: NasaApi): SearchRepository {
        return SearchRepositoryImpl(apiService)
    }
}