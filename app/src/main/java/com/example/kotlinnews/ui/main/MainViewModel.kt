package com.example.kotlinnews.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinnews.network.RedditNewsDataResponse
import com.example.kotlinnews.network.RedditResponse

enum class ApiStatus { LOADING, ERROR, DONE }

class MainViewModel : ViewModel() {
    // The internal and external Mutable/LiveData that stores the status of the most recent request
    private val _status = MutableLiveData<RedditResponse>()
    val status: LiveData<RedditResponse>
        get() = _status

    private val _navigateToSelected = MutableLiveData<RedditNewsDataResponse>()
    val navigateToSelectedProperty: LiveData<RedditNewsDataResponse>
        get() = _navigateToSelected
}
