package com.atatar.bluescreenkotlin.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.Retrofit.Builder
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.Lazy as KotlinLazy


object ApiClient  {

    const val BASE_URL = "https://api.themoviedb.org/3/"


        val retrofitBuilder: Retrofit.Builder by lazy {
           Retrofit.Builder()
                .baseUrl(ApiClient.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())

    }

   val apiService: ApiService by lazy{
       retrofitBuilder.build().create(ApiService::class.java)
   }

}