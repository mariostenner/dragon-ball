package com.mariods.practiceall1.data.network


import com.mariods.practiceall1.data.model.DragonNetworkItems
import com.mariods.practiceall1.data.model.DragonNetworkModel
import com.mariods.practiceall1.domain.model.DragonModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DragonService @Inject constructor(private val dragonApiClient: DragonApiClient) {

    suspend fun getCharacters(): List<DragonNetworkModel>{
        return withContext(Dispatchers.IO){
            val response = dragonApiClient.getCharacters()
            response?.body()?.items?: emptyList()
        }
    }

}