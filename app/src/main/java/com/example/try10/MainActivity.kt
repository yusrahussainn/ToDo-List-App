package com.example.try10

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.try6.model.ItemModel
import com.example.try10.adapter.ItemRecyclerViewAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var done: Button
    private lateinit var toDo: Button
    private lateinit var itemRecyclerView: RecyclerView
    private lateinit var itemRecyclerViewAdapter: ItemRecyclerViewAdapter
    private val itemList = mutableListOf<ItemModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        done = findViewById(R.id.button3)
        toDo = findViewById(R.id.button4)

        done.setOnClickListener {
            val intent = Intent(this, Done::class.java)
            startActivity(intent)
        }

        toDo.setOnClickListener {
            val intent = Intent(this, ToDo::class.java)
            startActivity(intent)
        }


    }

}
