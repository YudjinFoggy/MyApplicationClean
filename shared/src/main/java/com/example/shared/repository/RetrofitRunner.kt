package com.example.shared.repository

import com.example.shared.data.dto.mappers.Mapper
import retrofit2.Response

class RetrofitRunner {

    suspend fun <R, E> invoke(
        mapper: Mapper<R, E>,
        request: suspend () -> Response<R>
    ): E? {
        val response = request()

        if (response.isSuccessful) return response.body()?.let { mapper.map(it) }
        else throw Throwable(response.errorBody().toString())
    }
}