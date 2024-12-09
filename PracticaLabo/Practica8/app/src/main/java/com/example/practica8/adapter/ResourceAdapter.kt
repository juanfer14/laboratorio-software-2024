package com.example.practica8.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practica8.R
import com.example.practica8.Resource

class ResourceAdapter(
    private val resourceList: List<Resource>,
    private val onClickListener: (Resource) -> Boolean
): RecyclerView.Adapter<ResourceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResourceViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ResourceViewHolder(layoutInflater.inflate(R.layout.item_resource, parent, false))

    }

    override fun onBindViewHolder(holder: ResourceViewHolder, position: Int) {
        val item = resourceList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = resourceList.size

}