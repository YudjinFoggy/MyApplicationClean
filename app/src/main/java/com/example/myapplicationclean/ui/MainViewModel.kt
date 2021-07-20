package com.example.myapplicationclean.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shared.data.dto.mappers.bored.BoredResponseMapper
import com.example.shared.domain.bored.LoadBoredUseCase
import com.example.shared.entities.bored.Bored
import com.example.shared.repository.RetrofitRunner
import com.example.shared.repository.bored.BoredDataSource
import com.example.shared.repository.bored.BoredRepository
import com.example.shared.updateOnSuccess
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val boredResponseMapper = BoredResponseMapper()
    private val retrofitRunner = RetrofitRunner()
    private val boredDataSource = BoredDataSource(
        boredResponseMapper, retrofitRunner
    )
    private val boredRepository = BoredRepository(boredDataSource)
    private val loadBoredUseCase = LoadBoredUseCase(boredRepository)

    private val _bored = MutableLiveData<Bored?>()
    val bored: LiveData<Bored?> = _bored

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading


    fun loadBored() {
        viewModelScope.launch {

            //Value from main tread
            //Post value from background
            _isLoading.value = true
            val result = loadBoredUseCase(LoadBoredUseCase.Params())
            result.updateOnSuccess(_bored)
            _isLoading.value = false
        }
    }

}