package com.example.ca481api

import retrofit2.Call
import retrofit2.http.GET

interface APIinterface{
    @GET ("posts")
    fun getAPIData(): Call<List<DataAPIItem>>
}