package com.mariods.practiceall1.domain.usecase

import android.util.Log
import com.mariods.practiceall1.data.repository.DragonRepository
import com.mariods.practiceall1.domain.model.TransformationsListModel
import javax.inject.Inject

class GetDetailCharacter @Inject constructor(private val dragonRepository: DragonRepository) {

    suspend operator fun invoke(id: Int): List<TransformationsListModel> {
        Log.i("ID MANDADO EN RESPOSITORY", id.toString())
        return dragonRepository.getDetailCharacterFromAPI(id)
    }

}