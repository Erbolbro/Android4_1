package com.example.android4_1.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android4_1.ui.data.model.Anime
import com.example.android4_1.ui.data.repositories.AnimeRepositories

class AnimeViewModel:ViewModel() {
    private val repositories = AnimeRepositories()
    private val _animeLiveData = MutableLiveData<List<Anime>>()
    val animeLiveData:LiveData<List<Anime>> = _animeLiveData

    init {
        _animeLiveData.value = repositories.animeList
    }

}