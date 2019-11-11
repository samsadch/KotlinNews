package com.example.kotlinnews.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinnews.network.Children

enum class ApiStatus { LOADING, ERROR, DONE }

class MainViewModel : ViewModel() {
    // The internal and external Mutable/LiveData that stores the status of the most recent request
    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus>
        get() = _status

    private val _responses = MutableLiveData<List<Children>>()
    val responses: LiveData<List<Children>>
        get() = _responses
}
