package com.example.shared.data.dto.mappers

interface Mapper<R, E> {
    fun map(from: R): E
}