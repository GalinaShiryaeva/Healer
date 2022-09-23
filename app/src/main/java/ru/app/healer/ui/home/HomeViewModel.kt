package ru.app.healer.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.app.healer.data.dto.Episode

class HomeViewModel : ViewModel() {

    private val _label = MutableLiveData<String>().apply {
        value = "This is HOME fragment"
    }
    val label: LiveData<String> = _label

    // FIXME ("must link to a repository")
    private val _data: MutableLiveData<List<Episode>> = getAllEpisodes()
    val data: LiveData<List<Episode>> = _data
}

private fun getAllEpisodes(): MutableLiveData<List<Episode>> {
    val data = MutableLiveData<List<Episode>>()

    val array = arrayListOf<Episode>()
    array.add(Episode(1, "Flu", "09 Sep 2021 - 21 Sep 2021"))
    array.add(Episode(2, "Allergy", "14 Oct 2021- 17 Oct 2021"))
    array.add(Episode(3, "Some disease", "09 Sep 2021 - 21 Sep 2021"))
    array.add(Episode(4, "Flu", "09 Sep 2021 - 21 Sep 2021"))
    array.add(Episode(5, "Some long name of some kind of illness", "09 Sep 2021 - 21 Sep 2021"))
    array.add(Episode(6, "Season allergy", "09 Sep 2021 - 21 Sep 2021"))
    array.add(Episode(7, "Flu", "09 Sep 2021 - 21 Sep 2021"))
    array.add(Episode(8, "Flu", "09 Sep 2021 - 21 Sep 2021"))

    data.value = array
    return data
}