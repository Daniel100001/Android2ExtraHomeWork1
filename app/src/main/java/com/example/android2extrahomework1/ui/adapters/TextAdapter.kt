package com.example.android2extrahomework1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android2extrahomework1.databinding.ItemTextBinding

class TextAdapter(private var items: MutableList<String>) :
    RecyclerView.Adapter<TextAdapter.ViewHolder>() {

    fun addItem(item: MutableList<String>) {
        this.items = item
        notifyItemInserted(items.size - 1)
    }

    class ViewHolder(binding: ItemTextBinding) : RecyclerView.ViewHolder(binding.root) {
        val textView: TextView = binding.textViewText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTextBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }
}