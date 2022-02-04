package com.muhammed.navigationcomponent.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammed.navigationcomponent.data.Fruit
import com.muhammed.navigationcomponent.databinding.ItemFruitBinding

/**
 * Created by Muhammed COBANOGLU on 27.01.2022.
 */
class FruitListAdapter(private val dataSet: List<Fruit>, private val itemClickListener: (Fruit) -> Unit) :
    RecyclerView.Adapter<FruitListAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemFruitBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(fruit: Fruit, itemClickListener: (Fruit) -> Unit) {
            binding.fruit = fruit
            binding.root.setOnClickListener {
                itemClickListener(fruit)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemFruitBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(dataSet[position], itemClickListener)

    override fun getItemCount(): Int = dataSet.size
}