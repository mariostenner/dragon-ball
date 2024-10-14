package com.mariods.practiceall1.data.network

import com.mariods.practiceall1.data.model.CharacterNetworkItems
import com.mariods.practiceall1.data.model.TransformationsNetworkModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DragonApiClient {

    @GET("/api/characters")
    suspend fun getCharacters(@Query("page") page: Int = 1,
                              @Query("limit") limit: Int = 1000): Response<CharacterNetworkItems>

    @GET("/api/characters/{id}")
    suspend fun getDetailCharacter(@Path("id") id: Int): Response<TransformationsNetworkModel>
}