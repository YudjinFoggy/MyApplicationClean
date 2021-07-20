package com.example.myapplicationclean.ui.bored

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class BoredAdapter(fm: FragmentManager, lc: Lifecycle)
    : FragmentStateAdapter(fm,lc) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> BoredCurrentFragment()
            1-> BoredHistoryFragment()
            else -> BoredCurrentFragment()
        }
    }
}