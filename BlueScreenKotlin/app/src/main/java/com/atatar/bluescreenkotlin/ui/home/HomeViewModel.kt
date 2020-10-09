package com.atatar.bluescreenkotlin.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.atatar.bluescreenkotlin.models.Result
import com.atatar.bluescreenkotlin.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class HomeViewModel : ViewModel() {

   private val repository: MovieRepository = MovieRepository()
    var popularMovies = MutableLiveData<List<Result>>()


    fun getPopularMovies() {

           viewModelScope.launch {
               withContext(Dispatchers.IO){
                   var movieResponce = repository.getMoviesPopular()
                   popularMovies.postValue(movieResponce.results)
               }

    }
    }


}


