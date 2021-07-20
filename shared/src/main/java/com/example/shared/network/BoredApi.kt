package com.example.shared.network

import com.example.shared.BuildConfig
import com.example.shared.BuildConfig.API_URL
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object BoredApi {

    private val interceptor = HttpLoggingInterceptor().apply {
        if (BuildConfig.DEBUG) level = HttpLoggingInterceptor.Level.BODY
    }

    private val client = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()

    fun provideRetrofit(): BoredService {

        val retrofit = Retrofit.Builder()
            .baseUrl(API_URL)
            .client(client)
            .addCallAdapterFactory(CoroutineCallAdapterFactory.invoke())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create()
    }
}