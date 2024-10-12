package com.mariods.practiceall1.data.model

import com.google.gson.annotations.SerializedName


data class CharacterNetworkItems(
    @SerializedName("items") val items: List<CharacterNetworkModel>
)

data class CharacterNetworkModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("ki") val ki: String,
    @SerializedName("maxKi") val maxKi: String,
    @SerializedName("race") val race: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("description") val description: String,
    @SerializedName("image") val image: String,
    @SerializedName("affiliation") val affiliation: String
)
