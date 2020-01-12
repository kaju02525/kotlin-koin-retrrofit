package com.winds.kotlinkoindagger.network

import com.winds.kotlinkoindagger.model.ApiResponse
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("/demos/marvel")
    fun getAllUsers(): Single<List<ApiResponse>>

}