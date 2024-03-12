package com.example.android4_1.ui.data.repositories

import com.example.android4_1.R
import com.example.android4_1.ui.data.model.Anime

class AnimeRepositories {
    val animeList = mutableListOf<Anime>()

    init {
        addAnime()
    }
    private fun addAnime() {
        animeList.add(Anime(R.drawable.bleach, "Bleach"))
        animeList.add(Anime(R.drawable.boruto, "Boruto"))
        animeList.add(Anime(R.drawable.berserk, "Berserk"))
        animeList.add(Anime(R.drawable.attack_on_titan, "Attack on titan"))
        animeList.add(Anime(R.drawable.boku_no_hero, "Boku no hero"))
        animeList.add(Anime(R.drawable.death_note, "Death Note"))
        animeList.add(Anime(R.drawable.hunter_x_hunter, "Hunter x Hunter"))
        animeList.add(Anime(R.drawable.on_peace, "On Peace"))
        animeList.add(Anime(R.drawable.on_puch_man, "On puch man"))
        animeList.add(Anime(R.drawable.naruto, "Naruto"))
        animeList.add(Anime(R.drawable.dragon_ball, "Dragon Boll"))
        animeList.add(Anime(R.drawable.pokemon, "Pokemon"))
    }
}