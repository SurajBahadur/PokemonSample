package com.example.pokemontest.ui.tab

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.pokemontest.ui.msr.MsrDevFragment
import com.example.pokemontest.ui.pokemon.PokemonFragment

class PokemonTabAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                return PokemonFragment()
            }
            1 -> {
                return MsrDevFragment()
            }
        }
        return PokemonFragment()
    }
}