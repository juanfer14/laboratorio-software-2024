package com.example.practica8

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practica8.adapter.ResourceAdapter
import com.example.practica8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.fab.setOnClickListener{
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, ResourceProvider.toString())
                type = "text/plain"
            }
            startActivity(shareIntent)
        }
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        // val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerResource.layoutManager = manager
        binding.recyclerResource.adapter = ResourceAdapter(ResourceProvider.ResourceList){
            resource -> onItemSelected(resource)
        }
    }

    fun onItemSelected(resource: Resource): Boolean {
        //Toast.makeText(this, resource.name, Toast.LENGTH_SHORT).show()
        val webIntent = Intent().apply {
            action = Intent.ACTION_VIEW
            data =  Uri.parse(resource.url)
        }
        startActivity(webIntent)
        return true
    }
}