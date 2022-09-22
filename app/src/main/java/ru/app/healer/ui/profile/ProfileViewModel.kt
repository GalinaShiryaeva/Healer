package ru.app.healer.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

    private val _label = MutableLiveData<String>().apply {
        value = "This is PROFILE fragment"
    }
    val label: LiveData<String> = _label
}