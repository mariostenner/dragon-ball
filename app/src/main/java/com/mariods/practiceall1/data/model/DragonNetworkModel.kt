package com.mariods.practiceall1.data.model

import com.google.gson.annotations.SerializedName
import com.mariods.practiceall1.domain.model.DragonModel


data class DragonNetworkItems(
        @SerializedName("items") val items: List<DragonNetworkModel>
)

data class DragonNetworkModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("ki") val ki: String,
    @SerializedName("maxKi") val maxKi: String,
    @SerializedName("race") val race: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("description") val description: String,
    @SerializedName("image") val image: String,
    @SerializedName("affiliation") val affiliation: String,

)
