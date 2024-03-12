package com.example.android4_1.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android4_1.R
import com.example.android4_1.databinding.FragmentAnimeBinding
import com.example.android4_1.ui.adapter.AnimeAdapter


class AnimeFragment : Fragment(R.layout.fragment_anime) {
    private val animeAdapter = AnimeAdapter()
    private val binding by viewBinding(FragmentAnimeBinding::bind)
    private val viewModel by viewModels<AnimeViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupObserve()

    }

    private fun initialize() {
        binding.rvAnime.adapter = animeAdapter
    }

    private fun setupObserve()  {
        viewModel.animeLiveData.observe(viewLifecycleOwner){
            Log.e("tag","list:${animeAdapter}" )
            animeAdapter.submitList(it)
        }
    }
}