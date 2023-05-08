package com.example.mypokemons.data.model

import com.google.gson.annotations.SerializedName

data class Pokemon(
    @SerializedName("id") val id: Int = 0,
    @SerializedName("name") val name: String = "",
    @SerializedName("height") val height: Int? = null,
    @SerializedName("order") val order: Int? = null,
    @SerializedName("abilities") val abilities: ArrayList<Ability> = arrayListOf(),
    @SerializedName("forms") val forms: ArrayList<NamedResource> = arrayListOf(),
    @SerializedName("game_indices") val gameIndices: ArrayList<GameIndex> = arrayListOf(),
    @SerializedName("held_items") val heldItems: ArrayList<HeldItems> = arrayListOf(),
    @SerializedName("moves") val moves: ArrayList<Moves> = arrayListOf(),
    @SerializedName("species") val species: NamedResource? = null,
    @SerializedName("stats") val stats: ArrayList<Stats> = arrayListOf(),
)

data class Ability(
    @SerializedName("ability") val ability: NamedResource,
    @SerializedName("is_hidden") val isHidden: Boolean,
    @SerializedName("slot") val slot: Int
)

data class GameIndex(
    @SerializedName("game_index") val gameIndex: Int? = null,
    @SerializedName("version") val version: NamedResource? = null
)

data class VersionDetails(
    @SerializedName("rarity") val rarity: Int? = null,
    @SerializedName("version") val version: NamedResource? = null
)

data class HeldItems(
    @SerializedName("item") val item: NamedResource? = null,
    @SerializedName("version_details") val versionDetails: ArrayList<VersionDetails> = arrayListOf()
)

data class VersionGroupDetails(
    @SerializedName("level_learned_at") val levelLearnedAt: Int? = null,
    @SerializedName("version_group") val versionGroup: NamedResource? = null,
    @SerializedName("move_learn_method") val moveLearnMethod: NamedResource? = null
)

data class Moves(
    @SerializedName("move") val move: NamedResource? = null,
    @SerializedName("version_group_details") val versionGroupDetails: ArrayList<VersionGroupDetails> = arrayListOf()
)

data class Stats(
    @SerializedName("base_stat") val baseStat: Int? = null,
    @SerializedName("effort") val effort: Int? = null,
    @SerializedName("stat") val stat: NamedResource? = null
)

