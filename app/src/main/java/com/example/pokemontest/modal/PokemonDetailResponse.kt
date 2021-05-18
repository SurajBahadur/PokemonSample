package com.example.pokemontest.modal

import com.squareup.moshi.Json

data class PokemonDetailResponse(

	@Json(name="location_area_encounters")
	val locationAreaEncounters: String? = null,

	@Json(name="types")
	val types: List<TypesItem?>? = null,

	@Json(name="base_experience")
	val baseExperience: Int? = 0,

	@Json(name="held_items")
	val heldItems: List<Any?>? = null,

	@Json(name="weight")
	val weight: Int? = null,

	@Json(name="is_default")
	val isDefault: Boolean? = null,

	@Json(name="past_types")
	val pastTypes: List<Any?>? = null,

	@Json(name="sprites")
	val sprites: Sprites? = null,

	@Json(name="abilities")
	val abilities: List<AbilitiesItem?>? = null,

	@Json(name="game_indices")
	val gameIndices: List<GameIndicesItem?>? = null,

	@Json(name="species")
	val species: Species? = null,

	@Json(name="stats")
	val stats: List<StatsItem?>? = null,

	@Json(name="moves")
	val moves: List<MovesItem?>? = null,

	@Json(name="name")
	val name: String? = null,

	@Json(name="id")
	val id: Int? = null,

	@Json(name="forms")
	val forms: List<FormsItem?>? = null,

	@Json(name="height")
	val height: Int? = null,

	@Json(name="order")
	val order: Int? = null
)

data class GameIndicesItem(

	@Json(name="game_index")
	val gameIndex: Int? = null,

	@Json(name="version")
	val version: Version? = null
)

data class Other(

	@Json(name="dream_world")
	val dreamWorld: DreamWorld? = null,

	@Json(name="official-artwork")
	val officialArtwork: OfficialArtwork? = null
)

data class Crystal(

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class DreamWorld(

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null
)

data class Platinum(

	@Json(name="back_shiny_female")
	val backShinyFemale: Any? = null,

	@Json(name="back_female")
	val backFemale: Any? = null,

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_shiny_female")
	val frontShinyFemale: Any? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class OfficialArtwork(

	@Json(name="front_default")
	val frontDefault: String? = null
)

data class VersionGroup(

	@Json(name="name")
	val name: String? = null,

	@Json(name="url")
	val url: String? = null
)

data class Sprites(

	@Json(name="back_shiny_female")
	val backShinyFemale: Any? = null,

	@Json(name="back_female")
	val backFemale: Any? = null,

	@Json(name="other")
	val other: Other? = null,

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_shiny_female")
	val frontShinyFemale: Any? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="versions")
	val versions: Versions? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class OmegarubyAlphasapphire(

	@Json(name="front_shiny_female")
	val frontShinyFemale: Any? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class VersionGroupDetailsItem(

	@Json(name="level_learned_at")
	val levelLearnedAt: Int? = null,

	@Json(name="version_group")
	val versionGroup: VersionGroup? = null,

	@Json(name="move_learn_method")
	val moveLearnMethod: MoveLearnMethod? = null
)

data class FormsItem(

	@Json(name="name")
	val name: String? = null,

	@Json(name="url")
	val url: String? = null
)

data class GenerationIv(

	@Json(name="platinum")
	val platinum: Platinum? = null,

	@Json(name="diamond-pearl")
	val diamondPearl: DiamondPearl? = null,

	@Json(name="heartgold-soulsilver")
	val heartgoldSoulsilver: HeartgoldSoulsilver? = null
)

data class GenerationI(

	@Json(name="yellow")
	val yellow: Yellow? = null,

	@Json(name="red-blue")
	val redBlue: RedBlue? = null
)

data class Versions(

	@Json(name="generation-iii")
	val generationIii: GenerationIii? = null,

	@Json(name="generation-ii")
	val generationIi: GenerationIi? = null,

	@Json(name="generation-v")
	val generationV: GenerationV? = null,

	@Json(name="generation-iv")
	val generationIv: GenerationIv? = null,

	@Json(name="generation-vii")
	val generationVii: GenerationVii? = null,

	@Json(name="generation-i")
	val generationI: GenerationI? = null,

	@Json(name="generation-viii")
	val generationViii: GenerationViii? = null,

	@Json(name="generation-vi")
	val generationVi: GenerationVi? = null
)

data class Icons(

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null
)

data class Gold(

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class GenerationV(

	@Json(name="black-white")
	val blackWhite: BlackWhite? = null
)

data class TypesItem(

	@Json(name="slot")
	val slot: Int? = null,

	@Json(name="type")
	val type: Type? = null
)

data class GenerationVii(

	@Json(name="icons")
	val icons: Icons? = null,

	@Json(name="ultra-sun-ultra-moon")
	val ultraSunUltraMoon: UltraSunUltraMoon? = null
)

data class DiamondPearl(

	@Json(name="back_shiny_female")
	val backShinyFemale: Any? = null,

	@Json(name="back_female")
	val backFemale: Any? = null,

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_shiny_female")
	val frontShinyFemale: Any? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class BlackWhite(

	@Json(name="back_shiny_female")
	val backShinyFemale: Any? = null,

	@Json(name="back_female")
	val backFemale: Any? = null,

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_shiny_female")
	val frontShinyFemale: Any? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="animated")
	val animated: Animated? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class GenerationIi(

	@Json(name="gold")
	val gold: Gold? = null,

	@Json(name="crystal")
	val crystal: Crystal? = null,

	@Json(name="silver")
	val silver: Silver? = null
)

data class Move(

	@Json(name="name")
	val name: String? = null,

	@Json(name="url")
	val url: String? = null
)

data class UltraSunUltraMoon(

	@Json(name="front_shiny_female")
	val frontShinyFemale: Any? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class GenerationViii(

	@Json(name="icons")
	val icons: Icons? = null
)

data class Type(

	@Json(name="name")
	val name: String? = null,

	@Json(name="url")
	val url: String? = null
)

data class Yellow(

	@Json(name="front_gray")
	val frontGray: String? = null,

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="back_gray")
	val backGray: String? = null,

	@Json(name="front_default")
	val frontDefault: String? = null
)

data class AbilitiesItem(

	@Json(name="is_hidden")
	val isHidden: Boolean? = null,

	@Json(name="ability")
	val ability: Ability? = null,

	@Json(name="slot")
	val slot: Int? = null
)

data class RedBlue(

	@Json(name="front_gray")
	val frontGray: String? = null,

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="back_gray")
	val backGray: String? = null,

	@Json(name="front_default")
	val frontDefault: String? = null
)

data class XY(

	@Json(name="front_shiny_female")
	val frontShinyFemale: Any? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class HeartgoldSoulsilver(

	@Json(name="back_shiny_female")
	val backShinyFemale: Any? = null,

	@Json(name="back_female")
	val backFemale: Any? = null,

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_shiny_female")
	val frontShinyFemale: Any? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class Version(

	@Json(name="name")
	val name: String? = null,

	@Json(name="url")
	val url: String? = null
)

data class GenerationIii(

	@Json(name="firered-leafgreen")
	val fireredLeafgreen: FireredLeafgreen? = null,

	@Json(name="ruby-sapphire")
	val rubySapphire: RubySapphire? = null,

	@Json(name="emerald")
	val emerald: Emerald? = null
)

data class Species(

	@Json(name="name")
	val name: String? = null,

	@Json(name="url")
	val url: String? = null
)

data class MoveLearnMethod(

	@Json(name="name")
	val name: String? = null,

	@Json(name="url")
	val url: String? = null
)

data class StatsItem(

	@Json(name="stat")
	val stat: Stat? = null,

	@Json(name="base_stat")
	val baseStat: Int? = null,

	@Json(name="effort")
	val effort: Int? = null
)

data class Animated(

	@Json(name="back_shiny_female")
	val backShinyFemale: Any? = null,

	@Json(name="back_female")
	val backFemale: Any? = null,

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_shiny_female")
	val frontShinyFemale: Any? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="front_female")
	val frontFemale: Any? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class RubySapphire(

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class GenerationVi(

	@Json(name="omegaruby-alphasapphire")
	val omegarubyAlphasapphire: OmegarubyAlphasapphire? = null,

	@Json(name="x-y")
	val xY: XY? = null
)

data class MovesItem(

	@Json(name="version_group_details")
	val versionGroupDetails: List<VersionGroupDetailsItem?>? = null,

	@Json(name="move")
	val move: Move? = null
)

data class Stat(

	@Json(name="name")
	val name: String? = null,

	@Json(name="url")
	val url: String? = null
)

data class Ability(

	@Json(name="name")
	val name: String? = null,

	@Json(name="url")
	val url: String? = null
)

data class Emerald(

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class FireredLeafgreen(

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)

data class Silver(

	@Json(name="back_default")
	val backDefault: String? = null,

	@Json(name="front_default")
	val frontDefault: String? = null,

	@Json(name="back_shiny")
	val backShiny: String? = null,

	@Json(name="front_shiny")
	val frontShiny: String? = null
)
