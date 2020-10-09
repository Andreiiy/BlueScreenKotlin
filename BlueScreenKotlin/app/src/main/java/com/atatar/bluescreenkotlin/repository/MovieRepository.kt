package com.atatar.bluescreenkotlin.repository

import com.atatar.bluescreenkotlin.api.ApiClient
import com.atatar.bluescreenkotlin.models.MovieResponse
import com.atatar.bluescreenkotlin.models.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MovieRepository() {


     suspend fun getMoviesPopular(): MovieResponse =
        ApiClient.apiService.getAllMovie(
            "popular",
            "2c1c7b0fc68324519eec9863917f05e2",
            "en-IN")

}




