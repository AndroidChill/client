package com.example.githubclient.di.module

import android.util.Log
import com.example.auth.network.apiService.AuthService
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {

    companion object {
        private const val BASE_URL = "https://immense-lake-06047.herokuapp.com/"
    }

    @Singleton
    @Provides
    fun provideInterceptors(): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .writeTimeout(120, TimeUnit.SECONDS)

        builder.addInterceptor(
            HttpLoggingInterceptor { message ->
                Log.d("OkHttp", message)
            }
                .setLevel(HttpLoggingInterceptor.Level.BODY)
        )

        return builder.build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson) : Retrofit {
        return  Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    @Provides
    @Singleton
    fun provideAuthService(retrofit: Retrofit) : AuthService =
        retrofit.create(AuthService::class.java)

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return Gson()
    }
}