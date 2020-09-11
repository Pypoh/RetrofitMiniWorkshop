package com.example.retrofitminiworkshop.model

import com.google.gson.annotations.SerializedName

data class Anime(
    @SerializedName("request_hash")
    val request_hash: String? = null,

    @SerializedName("request_cached")
    val request_cached: Boolean? = null,

    @SerializedName("request_cache_expiry")
    val request_cache_expiry: Int? = null,

    @SerializedName("results")
    val results: List<Results?> = ArrayList()
)