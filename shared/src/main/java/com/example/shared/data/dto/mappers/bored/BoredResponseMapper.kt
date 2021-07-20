package com.example.shared.data.dto.mappers.bored

import com.example.shared.data.dto.bored.BoredResponse
import com.example.shared.data.dto.mappers.Mapper
import com.example.shared.entities.bored.Bored

class BoredResponseMapper : Mapper<BoredResponse, Bored> {
    override fun map(from: BoredResponse): Bored {
        return Bored(
            id = from.id.orEmpty(),
            description = from.description.orEmpty(),
            participants = from.participants ?: 0,
            type = from.type.orEmpty()
        )
    }
}