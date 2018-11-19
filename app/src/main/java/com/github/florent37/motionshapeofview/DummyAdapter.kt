package com.github.florent37.motionshapeofview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DummyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = object: RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false)){}

    override fun getItemCount() = 100

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

}