package ru.app.healer.data.repository

import androidx.lifecycle.LiveData

interface EpisodeRepository {
    fun getAll(): LiveData<List<Episode>>
    fun save(episode: Episode)
    fun removeById(id: Long)
    fun editById(id: Long)
    fun edit(episode: Episode)
}