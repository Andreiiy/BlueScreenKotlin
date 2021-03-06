package com.atatar.bluescreenkotlin.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.atatar.bluescreenkotlin.R
import com.atatar.bluescreenkotlin.adapters.MovieAdapter
import com.atatar.bluescreenkotlin.models.Result
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var adapter: MovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)



        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter =  MovieAdapter(mutableListOf())
        recyclerMovies.adapter = adapter
        recyclerMovies.layoutManager = LinearLayoutManager(context)
        homeViewModel.getPopularMovies()
        homeViewModel.popularMovies.observe(viewLifecycleOwner, Observer {
            recyclerMovies.adapter = MovieAdapter(it as MutableList<Result>)

        })
    }
}
