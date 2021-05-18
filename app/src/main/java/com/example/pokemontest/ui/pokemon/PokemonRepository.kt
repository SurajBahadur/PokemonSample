package com.example.pokemontest.ui.pokemon


import com.example.pokemontest.api.service.ApiHelper
import com.example.pokemontest.modal.PokemonListResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object PokemonRepository {

    private val webService = ApiHelper.createService()

    fun getPokemonList(
        successHandler: (PokemonListResponse) -> Unit,
        failureHandler: (String) -> Unit,
        onFailureHandler: (Throwable) -> Unit,
        url: String
    ) {
        webService.getPokemonList(url).enqueue(object : Callback<PokemonListResponse> {

            override fun onResponse(call: Call<PokemonListResponse>, response: Response<PokemonListResponse>) {
                response.body()?.let {
                    successHandler(it)
                }
            }

            override fun onFailure(call: Call<PokemonListResponse>, t: Throwable) {
                t.let {
                    onFailureHandler(it)
                }
            }


        })
    }

}