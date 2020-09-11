package com.example.retrofitminiworkshop.model

import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("mal_id")
    val mal_id: Int? = null,

    @SerializedName("url")
    val url: String? = null,

    @SerializedName("image_url")
    val image_url: String? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("airing")
    val airing: Boolean? = null,

    @SerializedName("synopsis")
    val synopsis: String? = null,

    @SerializedName("type")
    val type: String? = null,

    @SerializedName("episodes")
    val episodes: Int? = null,

    @SerializedName("score")
    val score: Double? = null,

    @SerializedName("start_date")
    val start_date: String? = null,

    @SerializedName("end_date")
    val end_date: String? = null,

    @SerializedName("members")
    val members: Int? = null,

    @SerializedName("rated")
    val rated: String? = null
)