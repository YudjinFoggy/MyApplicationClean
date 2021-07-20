package com.example.shared.repository.bored

import com.example.shared.entities.bored.Bored

class BoredRepository(
    private val boredDataSource: BoredDataSource
) {

    suspend fun getBored(): Bored? {
       return boredDataSource.getBored()
    }
}