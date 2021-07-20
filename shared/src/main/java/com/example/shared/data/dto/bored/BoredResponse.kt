package com.example.shared.data.dto.bored


import com.google.gson.annotations.SerializedName

data class BoredResponse(
    @SerializedName("activity")
    val description: String? = null,
    @SerializedName("key")
    val id: String? = null,
    @SerializedName("participants")
    val participants: Int? = null,
    @SerializedName("type")
    val type: String? = null
)