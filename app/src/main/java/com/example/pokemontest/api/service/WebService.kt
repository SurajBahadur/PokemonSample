package com.example.pokemontest.api.service


import com.example.pokemontest.modal.PokemonDetailResponse
import com.example.pokemontest.modal.PokemonListResponse
import retrofit2.Call
import retrofit2.http.*


interface WebService {
    @GET
    fun getPokemonList(@Url url: String): Call<PokemonListResponse>


    @GET("{fullUrl}")
    fun getPokemonDetail(@Path(value = "fullUrl", encoded = true)   fullUrl: String): Call<PokemonDetailResponse>

}