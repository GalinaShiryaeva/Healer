package ru.app.healer.ui.calendar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalendarViewModel : ViewModel() {

    private val _label = MutableLiveData<String>().apply {
        value = "This is CALENDAR fragment"
    }
    val label: LiveData<String> = _label
}