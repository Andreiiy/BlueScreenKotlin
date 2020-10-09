package com.atatar.bluescreenkotlin.api

import com.atatar.bluescreenkotlin.models.MovieResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/{criterial}")
   suspend fun getAllMovie(
        @Path("criterial") criterial: String?,
        @Query("api_key") api_key: String?,
        @Query("language") language: String?
        ): MovieResponse
}