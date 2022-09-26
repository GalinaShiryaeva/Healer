package ru.app.healer.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class EpisodeRepositoryInMemoryImpl : EpisodeRepository {
    private var episodes = listOf(
        Episode(
            id = 1,
            name = "Flu",
            duration = "09 Sep 2021 - 21 Sep 2021"
        ),
        Episode(
            id = 2,
            name = "Allergy",
            duration = "14 Oct 2021- 17 Oct 2021"
        ),
        Episode(
            id = 3,
            name = "Some disease",
            duration = "09 Sep 2021 - 21 Sep 2021"
        ),
        Episode(
            id = 4,
            name = "Flu",
            duration = "09 Sep 2021 - 21 Sep 2021"
        ),
        Episode(
            id = 5,
            name = "Some long name of some kind of illness",
            duration = "09 Sep 2021 - 21 Sep 2021"
        ),
        Episode(
            id = 6,
            name = "Season allergy",
            duration = "09 Sep 2021 - 21 Sep 2021"
        ),
        Episode(
            id = 7,
            name = "Flu",
            duration = "09 Sep 2021 - 21 Sep 2021"
        ),
        Episode(
            id = 8,
            name = "Flu",
            duration = "09 Sep 2021 - 21 Sep 2021"
        ),
    )
    private val _data: MutableLiveData<List<Episode>> = MutableLiveData(episodes)
    val data: LiveData<List<Episode>> = _data

    private var eId: Long =
        data.value?.size?.toLong() ?: error("Something went wrong with episode id")

    override fun getAll(): LiveData<List<Episode>> = data

    override fun save(episode: Episode) {
        episodes.map {
            if (it.id == episode.id) {
                it.copy(
                    name = episode.name
                )
            } else {
                listOf(
                    episode.copy(
                        id = eId.plus(1),
                        name = episode.name,
                        duration = episode.duration,
                        patient = episode.patient
                    )
                ) + episodes
            }
        }
        _data.value = episodes
    }

    override fun removeById(id: Long) {
        episodes = episodes.filter { it.id != id }
        _data.value = episodes
    }

    override fun editById(id: Long) {
        //FIXME("Not yet implemented")
    }

    override fun edit(episode: Episode) {
        //FIXME("Not yet implemented")
    }
}