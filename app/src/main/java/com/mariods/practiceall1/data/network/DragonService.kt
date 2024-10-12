package com.mariods.practiceall1.data.network


import com.mariods.practiceall1.data.model.CharacterNetworkModel
import com.mariods.practiceall1.data.model.DragonProvider.Companion.dummyList
import com.mariods.practiceall1.data.model.TransformationsListNetworkModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DragonService @Inject constructor(private val dragonApiClient: DragonApiClient) {


    suspend fun getCharacters(): List<CharacterNetworkModel> {
        return withContext(Dispatchers.IO) {
            val response = dragonApiClient.getCharacters()
            response.body()?.items ?: emptyList()
        }
    }

    suspend fun getDetailCharacter(id: Int): List<TransformationsListNetworkModel> {
        return withContext(Dispatchers.IO) {
            val response = dragonApiClient.getDetailCharacter(id)
            //if (response.isSuccessful){
            response.body()?.transformations ?: dummyList
            //}
        }
    }

}