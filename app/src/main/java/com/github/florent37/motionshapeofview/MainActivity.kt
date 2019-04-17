package com.github.florent37.motionshapeofview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_arc.setOnClickListener {
            startActivity(Intent(this, MainActivityArc::class.java))
        }
        btn_movie.setOnClickListener {
            startActivity(Intent(this, MainActivityMovie::class.java))
        }
        btn_diagnoal.setOnClickListener {
            startActivity(Intent(this, MainActivityDiagonal::class.java))
        }
    }
}