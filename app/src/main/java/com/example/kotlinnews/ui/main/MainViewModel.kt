package com.example.kotlinnews.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinnews.network.Api
import com.example.kotlinnews.network.Children
import com.example.kotlinnews.network.RedditApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

enum class ApiStatus { LOADING, ERROR, DONE }

class MainViewModel : ViewModel() {

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    private val _status = MutableLiveData<ApiStatus>()
    val status: LiveData<ApiStatus>
        get() = _status

    private val _responses = MutableLiveData<List<Children>>()
    val responses: LiveData<List<Children>>
        get() = _responses

    private val _navigateToSelectedProperty = MutableLiveData<Children>()
    val navigateToSelectedProperty: LiveData<Children>
        get() = _navigateToSelectedProperty


    init {
        //getMarsRealEstateProperties(MarsApiFilter.SHOW_ALL)
        getData()
    }


    private fun getData() {
        coroutineScope.launch {
            var getPropertiesDeferred = Api.retrofitService.getData()
            try {
                _status.value = ApiStatus.LOADING
                // this will run on a thread managed by Retrofit
                val listResult = getPropertiesDeferred.await()
                _status.value = ApiStatus.DONE
                _responses.value = listResult.data.children
            } catch (e: Exception) {
                _status.value = ApiStatus.ERROR
                _responses.value = null
            }
        }
    }
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}
