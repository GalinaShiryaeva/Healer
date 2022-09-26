package ru.app.healer.ui.home

import androidx.lifecycle.ViewModel
import ru.app.healer.data.repository.Episode
import ru.app.healer.data.repository.EpisodeRepositoryInMemoryImpl

class HomeViewModel : ViewModel() {

    private val repository = EpisodeRepositoryInMemoryImpl()
    val data = repository.getAll()

    fun editById(id: Long) = repository.editById(id) // edit(post), editContent(content)
    fun edit(episode: Episode) = repository.edit(episode)// FIXME
    fun removeById(id: Long) = repository.removeById(id)
    fun save() {
        //FIXME("Not yet implemented")
    }
}
