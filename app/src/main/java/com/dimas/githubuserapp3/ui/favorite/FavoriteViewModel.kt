package com.dimas.githubuserapp3.ui.favorite

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dimas.githubuserapp3.database.FavoriteEntity
import com.dimas.githubuserapp3.repository.FavoriteRepository

class FavoriteViewModel(application : Application) : ViewModel() {
    private val mFavRepository : FavoriteRepository = FavoriteRepository(application)
    fun getAllFavorites() : LiveData<List<FavoriteEntity>> = mFavRepository.getAllFavorites()
}