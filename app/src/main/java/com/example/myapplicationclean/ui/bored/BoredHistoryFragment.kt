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
import com.example.myapplicationclean.databinding.FragmentCurrentBoredBinding
import com.example.myapplicationclean.databinding.FragmentHistoryBoredBinding

class BoredHistoryFragment : Fragment() {
    lateinit var binding: FragmentHistoryBoredBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_history_bored, container, false
        )
        return binding.root
    }
}