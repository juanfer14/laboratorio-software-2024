package com.example.practica8.adapter


import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.practica8.R
import com.example.practica8.Resource
import com.example.practica8.ResourceType
import com.example.practica8.databinding.ItemResourceBinding

class ResourceViewHolder(view: View): ViewHolder(view) {
    private val binding = ItemResourceBinding.bind(view)

    fun render(resourceModel: Resource, onClickListener: (Resource) -> Boolean){
        binding.tvResourceName.text = resourceModel.name
        loadImage(resourceModel)
        itemView.setOnLongClickListener {
            onClickListener(resourceModel)
        }
    }

    private fun loadImage(resourceModel: Resource){
        when(resourceModel.type){
            ResourceType.IMAGE -> {
                binding.ivResource.contentDescription = "Imagen"
                Glide.with(binding.ivResource.context)
                    .load(R.drawable.baseline_image_24)
                    .into(binding.ivResource)
            }
            ResourceType.AUDIO -> {
                binding.ivResource.contentDescription = "Audio"
                Glide.with(binding.ivResource.context)
                    .load(R.drawable.baseline_audiotrack_24)
                    .into(binding.ivResource)
            }
            ResourceType.VIDEO -> {
                binding.ivResource.contentDescription = "Video"
                Glide.with(binding.ivResource.context)
                    .load(R.drawable.baseline_image_24)
                    .into(binding.ivResource)
            }
            ResourceType.WEB -> {
                binding.ivResource.contentDescription = "Web"
                Glide.with(binding.ivResource.context)
                    .load(R.drawable.baseline_aod_24)
                    .into(binding.ivResource)
            }
        }
    }
}