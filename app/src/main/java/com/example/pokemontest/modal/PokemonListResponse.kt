package com.example.pokemontest.modal

import com.squareup.moshi.Json

data class PokemonListResponse(

	@Json(name="next")
	val next: String? = null,

	@Json(name="previous")
	val previous: Any? = null,

	@Json(name="count")
	val count: Int? = null,

	@Json(name="results")
	val results: List<ResultsItem?>? = null
)

data class ResultsItem(

	@Json(name="name")
	val name: String? = null,

	@Json(name="url")
	val url: String? = null
)
