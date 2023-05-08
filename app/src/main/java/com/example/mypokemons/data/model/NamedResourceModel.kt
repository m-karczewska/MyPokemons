package com.example.mypokemons.data.model

import com.google.gson.annotations.SerializedName

data class NamedResource(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String = ""
)

data class NamedResourceList(
    @SerializedName("count") val count: Int = 0,
    @SerializedName("next") val next: String? = null,
    @SerializedName("previous") val previous: String? = null,
    @SerializedName("results") val results: List<NamedResource> = listOf()
)