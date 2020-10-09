package com.atatar.bluescreenkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.atatar.bluescreenkotlin.models.Result
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://images-na.ssl-images-amazon.com/images/I/81Pr0Tu0lXL._SL1500_.jpg"

        Glide.with(this).load(url).into(image)

        var listM = mutableListOf<Result>(Result())
        listM.add(Result())

        image.setOnClickListener( {
            intent = Intent(this,NavActivity::class.java)
            startActivity(intent)
        })
    }
}
