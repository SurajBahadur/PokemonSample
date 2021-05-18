package com.example.pokemontest.ui.pokemon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemontest.R
import com.example.pokemontest.databinding.ItemPokemonBinding
import com.example.pokemontest.modal.ResultsItem

class PokemonAdapter(val resultsItem: MutableList<ResultsItem>) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {


    class ViewHolder(val binding: ItemPokemonBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPokemonBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvName.text = resultsItem[position].name
        holder.binding.tvOrderNumber.text = position.toString()
        holder.binding.cvRoot.setOnClickListener { view ->
            val bundle = bundleOf(
                "url" to resultsItem[position].url,
                "name" to resultsItem[position].name,
            )
            view.findNavController().navigate(R.id.action_listing_to_detail, bundle)
        }
    }

    override fun getItemCount() = resultsItem.size
}