package com.example.myapplicationclean.ui.bored

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationclean.R
import com.example.myapplicationclean.databinding.FragmentBoredMainBinding
import com.example.myapplicationclean.databinding.FragmentCurrentBoredBinding
import com.example.myapplicationclean.ui.MainViewModel

class BoredCurrentFragment : Fragment() {
    lateinit var binding: FragmentCurrentBoredBinding
    private val viewModel by lazy { ViewModelProvider(requireActivity()).get(MainViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_current_bored, container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonLoad.setOnClickListener {
            viewModel.loadBored()
        }

        viewModel.isLoading.observe(viewLifecycleOwner) {
            binding.isLoading = it
        }

        viewModel.bored.observe(viewLifecycleOwner) {
            binding.boredDescription.text = it?.description
        }
    }
}