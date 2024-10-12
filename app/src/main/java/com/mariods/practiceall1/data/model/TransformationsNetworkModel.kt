package com.mariods.practiceall1.data.model

import com.google.gson.annotations.SerializedName

data class TransformationsNetworkModel(
    @SerializedName("id") val id: Int,
    @SerializedName("transformations") val transformations: List<TransformationsListNetworkModel>
)


data class TransformationsListNetworkModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("image") val image: String,
    @SerializedName("ki") val ki: String
)
