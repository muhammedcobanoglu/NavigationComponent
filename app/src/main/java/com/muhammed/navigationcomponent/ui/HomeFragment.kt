package com.muhammed.navigationcomponent.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammed.navigationcomponent.R
import com.muhammed.navigationcomponent.data.Fruit
import com.muhammed.navigationcomponent.data.fruitList
import com.muhammed.navigationcomponent.databinding.FragmentHomeBinding

/**
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        setupUI()

        return binding.root
    }

    private fun setupUI() {
        val fruitList = fruitList(this.resources)
        val fruitListAdapter = FruitListAdapter(fruitList) { selectedItem: Fruit ->
            itemClicked(
                selectedItem
            )
        }
        binding.fruitList.layoutManager = LinearLayoutManager(activity)
        binding.fruitList.addItemDecoration(
            DividerItemDecoration(
                binding.fruitList.context,
                (binding.fruitList.layoutManager as LinearLayoutManager).orientation
            )
        )
        binding.fruitList.adapter = fruitListAdapter
    }

    private fun itemClicked(fruit: Fruit) {
        val bundle = bundleOf("fruit_info" to fruit)
        findNavController().navigate(R.id.action_homeFragment_to_detailFragment, bundle)
    }
}