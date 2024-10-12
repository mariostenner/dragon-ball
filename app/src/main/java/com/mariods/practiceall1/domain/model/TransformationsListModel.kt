package com.mariods.practiceall1.domain.model

import com.mariods.practiceall1.data.model.TransformationsListNetworkModel

data class TransformationsListModel(
    val id: Int,
    val name: String,
    val image: String,
    val ki: String
)

fun TransformationsListNetworkModel.toDomain() =
    TransformationsListModel(id, name, image, ki)
