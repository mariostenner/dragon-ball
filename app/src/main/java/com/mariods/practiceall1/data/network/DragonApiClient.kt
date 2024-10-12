package com.mariods.practiceall1.data.network

import com.mariods.practiceall1.data.model.DragonNetworkItems
import com.mariods.practiceall1.domain.model.DragonModel
import retrofit2.Response
import retrofit2.http.GET

interface DragonApiClient {

    @GET("/api/characters?page=1&limit=1000")
    suspend fun getCharacters(): Response<DragonNetworkItems>

}