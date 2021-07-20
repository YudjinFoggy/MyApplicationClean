package com.example.shared.repository

import com.example.shared.data.dto.mappers.Mapper

class DbRunner {

    suspend fun <R, E> invoke(
        mapper: Mapper<R, E>,
        request: suspend () -> List<R>
    ): List<E> {
        val response = request()
        return response.map {
            mapper.map(it)
        }
    }
}