package com.example.githubrepos.modules.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.githubrepos.data.GithubRepository

class ViewModelFactory(private val repository: GithubRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListReposViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ListReposViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}