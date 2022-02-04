package com.muhammed.navigationcomponent.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.muhammed.navigationcomponent.BR
import com.muhammed.navigationcomponent.data.Fruit
import com.muhammed.navigationcomponent.databinding.FragmentDetailBinding

/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        setupData()

        return binding.root
    }

    private fun setupData() {
        val fruit : Fruit? = arguments?.getParcelable("fruit_info")
        binding.setVariable(BR.fruit, fruit)
    }
}