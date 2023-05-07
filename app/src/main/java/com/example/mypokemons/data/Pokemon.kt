package com.example.mypokemons.data

import com.google.gson.annotations.SerializedName;

data class Pokemon(
    @SerializedName("id") val id: Int = 0,
    @SerializedName("name") val name: String = "",
    @SerializedName("base_experience") val baseExperience: Int? = null,
    @SerializedName("height") val height: Int? = null,
//    @SerializedName("is_default") val isDefault: Boolean? = null,
    @SerializedName("order") val order: Int? = null,
    @SerializedName("weight") val weight: Int? = null,
    @SerializedName("abilities") val abilities: ArrayList<Ability> = arrayListOf(),
    @SerializedName("forms") val forms: ArrayList<NamedResource> = arrayListOf(),
    @SerializedName("game_indices") val gameIndices: ArrayList<GameIndex> = arrayListOf(),
    @SerializedName("held_items") val heldItems: ArrayList<HeldItems> = arrayListOf(),
//    @SerializedName("location_area_encounters") val locationAreaEncounters: String? = null,
    @SerializedName("moves") val moves: ArrayList<Moves> = arrayListOf(),
    @SerializedName("species") val species: NamedResource? = null,
//    @SerializedName("sprites") val sprites: Sprites? = Sprites(),
    @SerializedName("stats") val stats: ArrayList<Stats> = arrayListOf(),
//    @SerializedName("types") val types: ArrayList<Types> = arrayListOf(),
//    @SerializedName("past_types") val pastTypes: ArrayList<PastTypes> = arrayListOf()
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

//data class DreamWorld (
//
//    @SerializedName("front_default" ) val frontDefault : String? = null,
//    @SerializedName("front_female"  ) val frontFemale  : String? = null
//
//)

//data class Home (
//
//    @SerializedName("front_default"      ) val frontDefault     : String? = null,
//    @SerializedName("front_female"       ) val frontFemale      : String? = null,
//    @SerializedName("front_shiny"        ) val frontShiny       : String? = null,
//    @SerializedName("front_shiny_female" ) val frontShinyFemale : String? = null
//
//)
//
//data class OfficialArtwork(
//@SerializedName("front_default" ) val frontDefault : String? = null
//)
//
//data class Other (
//
//    @SerializedName("dream_world"      ) val dreamWorld       : DreamWorld?       = DreamWorld(),
//    @SerializedName("home"             ) val home             : Home?             = Home(),
//    @SerializedName("official-artwork" ) val OfficialArtwork : OfficialArtwork? = OfficialArtwork()
//
//)

//
//data class RedBlue (
//
//@SerializedName("back_default"  ) val backDefault  : String? = null,
//@SerializedName("back_gray"     ) val backGray     : String? = null,
//@SerializedName("front_default" ) val frontDefault : String? = null,
//@SerializedName("front_gray"    ) val frontGray    : String? = null
//
//)
//
//data class Yellow (
//
//    @SerializedName("back_default"  ) val backDefault  : String? = null,
//    @SerializedName("back_gray"     ) val backGray     : String? = null,
//    @SerializedName("front_default" ) val frontDefault : String? = null,
//    @SerializedName("front_gray"    ) val frontGray    : String? = null
//
//)
//
//data class GenerationI (
//
//@SerializedName("red-blue" ) val redBlue : RedBlue? = RedBlue(),
//@SerializedName("yellow"   ) val yellow   : Yellow?   = Yellow()
//
//)
//
//data class Crystal (
//
//    @SerializedName("back_default"  ) val backDefault  : String? = null,
//    @SerializedName("back_shiny"    ) val backShiny    : String? = null,
//    @SerializedName("front_default" ) val frontDefault : String? = null,
//    @SerializedName("front_shiny"   ) val frontShiny   : String? = null
//
//)

