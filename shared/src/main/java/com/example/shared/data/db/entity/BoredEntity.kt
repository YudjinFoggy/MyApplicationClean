package com.example.shared.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bored_table")
data class BoredEntity(
    val id: String,
    val type: String,
    val description: String,
    val participants: Int,
    @PrimaryKey(autoGenerate = true)
    var primaryKey: Int? = null
)
