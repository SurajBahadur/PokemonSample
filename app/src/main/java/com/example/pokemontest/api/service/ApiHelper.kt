package com.example.pokemontest.api.service

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit


object ApiHelper {
    private var mRetrofit: Retrofit

    init {
        val httpClient = OkHttpClient.Builder()

        httpClient.addInterceptor { chain ->
            val request = chain.request()
                .newBuilder()
                .build()
            chain.proceed(request)
        }

        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        mRetrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(getClient())
            .build()


    }



    // Creating OkHttpclient Object
    private fun getClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient().newBuilder().connectTimeout(10, TimeUnit.MINUTES)
            .readTimeout(10, TimeUnit.MINUTES)
            .writeTimeout(10, TimeUnit.MINUTES)
            .retryOnConnectionFailure(true)
            .addInterceptor(interceptor)
            .build()
    }

    //Creating service class for calling the web services
    fun createService(): WebService {
        return mRetrofit.create(WebService::class.java)
    }


}