package com.example.myapplicationclean.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationclean.R

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy { ViewModelProvider(this).get(MainViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.bored.observe(this) {
            Log.e("TAG", it.toString())
        }
    }
}