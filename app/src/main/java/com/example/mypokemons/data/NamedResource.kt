package com.example.mypokemons.data

data class NamedResource(
    val name: String,
    val url: String
) {
}

data class NamedResourceList(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<NamedResource>
)