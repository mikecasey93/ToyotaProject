package com.example.project.data

import com.example.project.model.ComicModel
import retrofit2.http.GET

interface EndPoint {

    @GET(ApiDetails.ENDPOINT)
    suspend fun getComic(): ComicModel
}