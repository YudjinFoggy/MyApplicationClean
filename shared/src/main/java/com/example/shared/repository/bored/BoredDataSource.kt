package com.example.shared.repository.bored

import com.example.shared.data.dto.mappers.bored.BoredResponseMapper
import com.example.shared.entities.bored.Bored
import com.example.shared.network.BoredApi
import com.example.shared.repository.RetrofitRunner

class BoredDataSource(
    private val boredResponseMapper: BoredResponseMapper,
    private val retrofitRunner: RetrofitRunner,
) {

    private val boredApi = BoredApi.provideRetrofit()

    suspend fun getBored(): Bored? {
        return retrofitRunner.invoke(boredResponseMapper) {
            boredApi.getBored()
        }
    }

}