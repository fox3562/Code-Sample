package com.v12ten.mvp_rentcycle.model.data.server

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiAdapter {

    val logging = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    val apiClient: ApiClient = Retrofit.Builder()
        .baseUrl("https://69cfde81-c42a-40ac-9f1d-a125a054f45f.mock.pstmn.io/registry/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiClient::class.java)
}