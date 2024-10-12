package com.mariods.practiceall1.domain.model

import com.mariods.practiceall1.data.model.DragonNetworkModel


data class DragonModel(
    val id: Int,
    val name: String,
    val ki: String,
    val maxKi: String,
    val race: String,
    val gender: String,
    val description: String,
    val image: String,
    val affiliation: String,
    //val deletedAt: String
)

fun DragonNetworkModel.toDomain() = DragonModel(id,name,ki,maxKi,race,gender,description,image,affiliation)
