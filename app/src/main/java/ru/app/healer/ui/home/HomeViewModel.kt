package ru.app.healer.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _label = MutableLiveData<String>().apply {
        value = "This is HOME fragment"
    }
    val label: LiveData<String> = _label
}