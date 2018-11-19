package com.github.florent37.motionshapeofview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_arc_list.*

class MainActivityArc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arc_list)

        recyclerView.adapter = DummyAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
