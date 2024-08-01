package com.example.project.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project.model.ComicModel
import com.example.project.retrofit.RetrofitClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class ComicViewModel: ViewModel() {

    private val _comic = MutableStateFlow<ComicModel?>(null)
    val comic: StateFlow<ComicModel?> = _comic

    init {
        fetchComic()
    }

    private fun fetchComic() {
        viewModelScope.launch(
            // dispatcher
        ) {
            try {
                val retrievedData = RetrofitClient.retrofitInstance.getComic()
                _comic.value = retrievedData
            } catch(err: Exception) {
                _comic.value = null
            }
        }
    }
}