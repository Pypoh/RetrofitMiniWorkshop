package com.example.retrofitminiworkshop.model

import com.google.gson.annotations.SerializedName

data class TopAnimeResults (
    @SerializedName("mal_id")
    val mal_id: Int? = null,

    @SerializedName("rank")
    val rank: Int? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("url")
    val url: String? = null,

    @SerializedName("image_url")
    val image_url: String? = null,

    @SerializedName("type")
    val type: String? = null,

    @SerializedName("episodes")
    val episodes: Int? = null,

    @SerializedName("start_date")
    val start_date: String? = null,

    @SerializedName("end_date")
    val end_date: String? = null,

    @SerializedName("members")
    val members: Int? = null,

    @SerializedName("score")
    val score: Double? = null
)