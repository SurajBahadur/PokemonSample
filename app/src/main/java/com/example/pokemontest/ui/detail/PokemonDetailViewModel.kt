package com.example.pokemontest.ui.detail

import androidx.lifecycle.MutableLiveData
import com.example.pokemontest.api.model.MyViewModel
import com.example.pokemontest.modal.PokemonDetailResponse
import com.example.pokemontest.modal.PokemonListResponse
import com.example.pokemontest.ui.pokemon.PokemonRepository

class PokemonDetailViewModel : MyViewModel() {
    var response = MutableLiveData<PokemonDetailResponse>()
    fun getPokemonDetail(url: String) {
        isLoading.value = true
        PokemonDetailRepository.getPokemonDetail({
            response.value = it
            isLoading.value = false
        }, {
            apiError.value = it
            isLoading.value = false
        }, {
            onFailure.value = it
            isLoading.value = false
        }, url)
    }

}