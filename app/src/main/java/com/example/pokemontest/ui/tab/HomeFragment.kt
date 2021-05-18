package com.example.pokemontest.ui.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.pokemontest.R
import com.example.pokemontest.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var tabAdapter: PokemonTabAdapter
    private lateinit var viewPager: ViewPager2
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tabAdapter = PokemonTabAdapter(this)
        viewPager = binding.viewPager
        viewPager.adapter = tabAdapter

        TabLayoutMediator(binding.tabLayout, viewPager) { tab, position ->
            if (position == 0) {
                tab.text = getString(R.string.tab_pokemon)
            } else {
                tab.text = getString(R.string.tab_msr_dev)
            }
        }.attach()
    }

}