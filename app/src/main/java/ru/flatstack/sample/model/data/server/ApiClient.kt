package com.v12ten.mvp_rentcycle.model.data.server

import retrofit2.http.GET
import ru.flatstack.sample.entities.SimpleWh

interface ApiClient {

    @GET("mno")
    suspend fun getWhList(): List<SimpleWh>
}