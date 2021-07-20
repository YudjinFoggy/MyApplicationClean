package com.example.shared.domain.bored

import com.example.shared.UseCase
import com.example.shared.entities.bored.Bored
import com.example.shared.repository.bored.BoredRepository
import kotlinx.coroutines.Dispatchers

class LoadBoredUseCase(
    private val boredRepository: BoredRepository
) : UseCase<LoadBoredUseCase.Params, Bored?>(Dispatchers.IO) {

    override suspend fun execute(parameters: Params): Bored? {
        return boredRepository.getBored()
    }

    data class Params(
        val lang: String? = null
    )
}