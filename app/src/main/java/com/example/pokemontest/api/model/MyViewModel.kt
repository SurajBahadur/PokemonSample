package com.example.pokemontest.api.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


open class MyViewModel : ViewModel() {

    var apiError = MutableLiveData<String>()
    var onFailure = MutableLiveData<Throwable>()
    var badRequest = MutableLiveData<String>()
    var isLoading = MutableLiveData<Boolean>()

}