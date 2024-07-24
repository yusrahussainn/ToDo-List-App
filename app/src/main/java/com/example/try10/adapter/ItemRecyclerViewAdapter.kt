package com.example.try10.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.example.try10.R
import com.example.try6.model.ItemModel

class ItemRecyclerViewAdapter(private val mList: List<ItemModel>) : RecyclerView.Adapter<ItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemModel = mList[position]
        holder.editText.setText(itemModel.text)
        holder.checkBox.isChecked = itemModel.isChecked
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val editText: EditText = itemView.findViewById(R.id.textView)
        val checkBox: CheckBox = itemView.findViewById(R.id.checkBox)
    }
}
