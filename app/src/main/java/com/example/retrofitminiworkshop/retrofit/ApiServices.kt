package com.example.retrofitminiworkshop.retrofit

import com.example.retrofitminiworkshop.model.Anime
import com.example.retrofitminiworkshop.model.TopAnime
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


interface ApiServices {

    @GET("v3/top/anime")
    fun getTopAnime() : Call<TopAnime>

    @GET("v3/search/anime")
    fun getAnimeResult(@Query("q") q: String?): Call<Anime>

//    @POST("users/new")
//    fun createUser(@Body user: User?): Call<User?>?

}