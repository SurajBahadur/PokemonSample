package com.example.pokemontest.ui.detail

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokemontest.MainActivity
import com.example.pokemontest.R
import com.example.pokemontest.base.BaseFragment
import com.example.pokemontest.databinding.FragmentPokemonBinding
import com.example.pokemontest.databinding.FragmentPokemonDetailBinding
import com.example.pokemontest.modal.PokemonDetailResponse
import com.example.pokemontest.modal.ResultsItem
import com.example.pokemontest.ui.pokemon.PokemonAdapter
import com.example.pokemontest.ui.pokemon.PokemonViewModel


class PokemonDetailFragment : BaseFragment() {
    private lateinit var binding: FragmentPokemonDetailBinding
    private lateinit var viewModel: PokemonDetailViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_pokemon_detail, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).supportActionBar?.title = arguments?.getString("name")!!
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        viewModel = ViewModelProvider(this).get(PokemonDetailViewModel::class.java)
        attachObservers()
        viewModel.getPokemonDetail(arguments?.getString("url")!!)
    }



    private fun attachObservers() {
        viewModel.response.observe(viewLifecycleOwner, {
            updateUI(it)
        })

        viewModel.apiError.observe(viewLifecycleOwner, {
            it?.let {
                showSnackBar(it)
            }
        })

        viewModel.isLoading.observe(viewLifecycleOwner, {
            it?.let { showLoading(it) }
        })

        viewModel.onFailure.observe(viewLifecycleOwner, {
            it?.let {
                showSnackBar(getString(R.string.something_wrong))
            }
        })
    }

    private fun updateUI(it: PokemonDetailResponse?) {
        binding.tvPokemonExpr.text = it?.baseExperience.toString()
        binding.tvPokemonName.text = it?.name
        binding.tvPokemonWeight.text = it?.weight.toString()

        Log.d("ttttt", "${it?.sprites}")
        Glide.with(this)
            .load(it?.sprites?.frontDefault)
            .into(binding.ivPokemonImage);

    }
}