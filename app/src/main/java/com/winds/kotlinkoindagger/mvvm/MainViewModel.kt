package com.winds.kotlinkoindagger.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.winds.kotlinkoindagger.model.ApiResponse
import com.winds.kotlinkoindagger.repository.Repository

class MainViewModel(private val repository: Repository) : ViewModel() {

    fun getUserData(): MutableLiveData<List<ApiResponse>> {
        return repository.getMessage()
    }

    fun fetchUsers() {
        repository.fetchUsers()
    }
}
