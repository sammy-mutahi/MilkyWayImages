package com.sammy.data.repository

import com.google.common.truth.Truth
import com.sammy.data.data.network.NasaApi
import com.sammy.data.data.repository.SearchRepositoryImpl
import com.sammy.data.network.invalidResponse
import com.sammy.data.network.validDToResponse
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

class SearchRepositoryImplTest {
    private lateinit var repositoryImpl: SearchRepositoryImpl
    private lateinit var mockWebServer: MockWebServer
    private lateinit var api: NasaApi
    private lateinit var okHttpClient: OkHttpClient

    @Before
    fun setUp() {
        mockWebServer = MockWebServer()
        okHttpClient = OkHttpClient.Builder()
            .writeTimeout(1, TimeUnit.SECONDS)
            .readTimeout(1, TimeUnit.SECONDS)
            .connectTimeout(1, TimeUnit.SECONDS)
            .build()
        api = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create().asLenient())
            .client(okHttpClient)
            .baseUrl(mockWebServer.url("/"))
            .build()
            .create(NasaApi::class.java)
        repositoryImpl = SearchRepositoryImpl(api)

    }

    @Test
    fun `Get search result, Valid response, Return result`() = runBlocking {

        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(200)
                .setBody(validDToResponse)
        )
        val result = repositoryImpl.getMockSearchResult(
            query = "milky way",
            mediaType = "image",
            startYear = "2017",
            endYear = "2017"
        )
        Truth.assertThat(result.isSuccess).isTrue()
    }

    @Test
    fun `Get search result, invalid response, Return exception`() = runBlocking {
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(404)
                .setBody(invalidResponse)
        )
        val result = repositoryImpl.getSearchResult(
            query = "milky way",
            mediaType = "image",
            startYear = "2017",
            endYear = "2017"
        )
        Truth.assertThat(result.isFailure).isTrue()
    }

    @After
    fun tearDown() {
        mockWebServer.shutdown()
    }
}