package com.example.pokemontest.ui.pokemon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemontest.MainActivity
import com.example.pokemontest.R
import com.example.pokemontest.base.BaseFragment
import com.example.pokemontest.databinding.FragmentPokemonBinding
import com.example.pokemontest.modal.ResultsItem


class PokemonFragment : BaseFragment() {
    private lateinit var binding: FragmentPokemonBinding
    private lateinit var viewModel: PokemonViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_pokemon, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(PokemonViewModel::class.java)
        attachObservers()
        viewModel.getPokemonList("pokemon?limit=50")
        (activity as MainActivity).supportActionBar?.title=getString(R.string.app_name)
        (activity as MainActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
    }

    private fun attachObservers() {
        viewModel.response.observe(viewLifecycleOwner, {
            if (it.results?.isNotEmpty()!!) {
                binding.rvPokemonList.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
                val listAdapter = PokemonAdapter(it.results as MutableList<ResultsItem>)
                binding.rvPokemonList.adapter = listAdapter
                listAdapter.notifyDataSetChanged()
            }
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


}