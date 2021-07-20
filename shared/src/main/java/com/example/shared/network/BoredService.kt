package com.example.shared.network

import com.example.shared.data.dto.bored.BoredResponse
import retrofit2.Response
import retrofit2.http.GET

interface BoredService {

    @GET("activity/")
    suspend fun getBored(): Response<BoredResponse>

}