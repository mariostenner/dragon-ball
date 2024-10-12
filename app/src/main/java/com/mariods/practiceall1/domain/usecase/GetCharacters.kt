package com.mariods.practiceall1.domain.usecase

import com.mariods.practiceall1.domain.model.DragonModel
import com.mariods.practiceall1.data.repository.DragonRepository
import javax.inject.Inject

class GetCharacters @Inject constructor(private val dragonRepository: DragonRepository) {

    suspend operator fun invoke(): List<DragonModel>{
        return dragonRepository.getCharactersFromAPI()
    }

}