package com.example.kotlinnews.ui.details

import android.app.Application
import androidx.lifecycle.*
import com.example.kotlinnews.network.Children

class DetailViewModel(marsProperty: Children, app: Application) : AndroidViewModel(app) {

    private val _selectedChild = MutableLiveData<Children>()

    val selectedChild: LiveData<Children>
        get() = _selectedChild

    init {
        _selectedChild.value = marsProperty
    }

    val displayChildTitle = Transformations.map(selectedChild) {
        it.data.title
    }

    // The displayPropertyType formatted Transformation Map LiveData, which displays the
    // "For Rent/Sale" String
    /*val displayPropertyType = Transformations.map(selectedProperty) {
        app.applicationContext.getString(R.string.display_type,
            app.applicationContext.getString(
                when(it.isRental) {
                    true -> R.string.type_rent
                    false -> R.string.type_sale
                }))
    }*/

    override fun onCleared() {
        super.onCleared()
    }

}
