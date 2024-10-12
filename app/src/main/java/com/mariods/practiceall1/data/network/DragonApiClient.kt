package com.mariods.practiceall1.data.network

import com.mariods.practiceall1.data.model.CharacterNetworkItems
import com.mariods.practiceall1.data.model.TransformationsNetworkModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface DragonApiClient {

    @GET("/api/characters?page=1&limit=1000")
    suspend fun getCharacters(): Response<CharacterNetworkItems>

    @GET("/api/characters/{id}")
    suspend fun getDetailCharacter(@Path("id") id: Int): Response<TransformationsNetworkModel>
}