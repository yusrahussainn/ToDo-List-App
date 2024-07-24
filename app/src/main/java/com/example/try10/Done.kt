package com.example.try10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.try10.adapter.ItemRecyclerViewAdapter
import com.example.try6.model.ItemModel

class Done : AppCompatActivity() {

    private lateinit var itemRecyclerView: RecyclerView
    private lateinit var itemRecyclerViewAdapter: ItemRecyclerViewAdapter
    private val itemList = mutableListOf<ItemModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done) // Make sure you have this layout file
        initUI()
    }

    private fun initUI() {
        // Initialize RecyclerView
        itemRecyclerView = findViewById(R.id.recyclerView)

        // Set LayoutManager
        itemRecyclerView.layoutManager = LinearLayoutManager(this)

        // Add items to the list
        for (i in 1..100)
        {
            itemList.add(ItemModel(text = "", isChecked = false))
        }

        val checkedItems = itemList.filter { it.isChecked }

        // Set Adapter
        itemRecyclerViewAdapter = ItemRecyclerViewAdapter(itemList)
        itemRecyclerView.adapter = itemRecyclerViewAdapter
    }
}
