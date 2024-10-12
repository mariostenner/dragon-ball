package com.mariods.practiceall1.data.repository

import com.mariods.practiceall1.data.model.DragonProvider.Companion.dummyList
import com.mariods.practiceall1.data.network.DragonService
import com.mariods.practiceall1.domain.model.CharacterModel
import com.mariods.practiceall1.domain.model.TransformationsListModel
import com.mariods.practiceall1.domain.model.toDomain
import javax.inject.Inject

class DragonRepository @Inject constructor(private val dragonService: DragonService) {

    suspend fun getCharactersFromAPI(): List<CharacterModel> {
        val response = dragonService.getCharacters()
        return response.map {
            it.toDomain()
        }
    }


    suspend fun getDetailCharacterFromAPI(id: Int): List<TransformationsListModel> {
        val response = dragonService.getDetailCharacter(id)

        return response.map {
            it.toDomain()
        }

    }

}