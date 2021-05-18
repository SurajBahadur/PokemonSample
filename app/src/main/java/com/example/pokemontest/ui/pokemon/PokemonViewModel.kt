package com.example.pokemontest.ui.pokemon

import androidx.lifecycle.MutableLiveData
import com.example.pokemontest.api.model.MyViewModel
import com.example.pokemontest.modal.PokemonListResponse

class PokemonViewModel : MyViewModel() {
    var response = MutableLiveData<PokemonListResponse>()
    fun getPokemonList(url: String) {
        isLoading.value = true
        PokemonRepository.getPokemonList({
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