package com.mariods.practiceall1.data.repository

import com.mariods.practiceall1.domain.model.DragonModel
import com.mariods.practiceall1.data.network.DragonService
import com.mariods.practiceall1.domain.model.toDomain
import javax.inject.Inject

class DragonRepository @Inject constructor(private val dragonService: DragonService){

    suspend fun getCharactersFromAPI(): List<DragonModel>{
        val response = dragonService.getCharacters()

        return response.map {
            it.toDomain()
        }
    }

}