package com.example.myapplicationclean.ui.bored

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.myapplicationclean.R
import com.example.myapplicationclean.databinding.FragmentBoredMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class BoredMainFragment : Fragment() {
    lateinit var binding: FragmentBoredMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_bored_main, container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewPager.adapter = BoredAdapter(childFragmentManager, lifecycle)

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = when(position){
                0->"Current"
                1->"History"
                else -> "Current"
            }
        }.attach()

    }
}