package com.atatar.bluescreenkotlin.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.atatar.bluescreenkotlin.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_list.view.*
import com.atatar.bluescreenkotlin.models.Result
import com.atatar.bluescreenkotlin.ui.home.HomeFragment
import java.lang.StringBuilder


class MovieAdapter(val listMovies:List<Result>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_list,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(listMovies.get(position))
    }

    override fun getItemCount(): Int {
        return listMovies.size
    }



    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movie: Result) {
           var thumbURL ="https://image.tmdb.org/t/p/w300${movie.backdropPath}"

            itemView.title.text = movie.originalTitle
            Glide.with(itemView.context).load(thumbURL).into(itemView.thumb)




        }

    }
}