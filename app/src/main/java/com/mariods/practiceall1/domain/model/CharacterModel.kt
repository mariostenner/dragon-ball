package com.mariods.practiceall1.domain.model

import com.mariods.practiceall1.data.model.CharacterNetworkModel


data class CharacterModel(
    val id: Int,
    val name: String,
    val ki: String,
    val maxKi: String,
    val race: String,
    val gender: String,
    val description: String,
    val image: String,
    val affiliation: String
)

fun CharacterNetworkModel.toDomain() =
    CharacterModel(id, name, ki, maxKi, race, gender, description, image, affiliation)

