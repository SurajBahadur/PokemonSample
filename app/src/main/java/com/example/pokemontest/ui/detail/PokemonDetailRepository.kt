package com.example.pokemontest.ui.detail


import com.example.pokemontest.api.service.ApiHelper
import com.example.pokemontest.modal.PokemonDetailResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object PokemonDetailRepository {

    private val webService = ApiHelper.createService()

    fun getPokemonDetail(
        successHandler: (PokemonDetailResponse) -> Unit,
        failureHandler: (String) -> Unit,
        onFailureHandler: (Throwable) -> Unit,
        url: String
    ) {
        webService.getPokemonDetail(url).enqueue(object : Callback<PokemonDetailResponse> {

            override fun onResponse(call: Call<PokemonDetailResponse>, response: Response<PokemonDetailResponse>) {
                response.body()?.let {
                    successHandler(it)
                }
            }

            override fun onFailure(call: Call<PokemonDetailResponse>, t: Throwable) {
                t.let {
                    onFailureHandler(it)
                }
            }


        })
    }

}