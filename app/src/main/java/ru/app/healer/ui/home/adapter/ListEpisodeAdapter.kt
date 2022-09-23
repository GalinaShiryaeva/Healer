package ru.app.healer.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.app.healer.R
import ru.app.healer.data.dto.Episode
import ru.app.healer.databinding.ItemEpisodeBinding

interface OnEpisodeListener {
    fun onEpisode(episode: Episode)
}

class ListEpisodeAdapter(
    private val onEpisodeListener: OnEpisodeListener
) : ListAdapter<Episode, ListEpisodeAdapter.EpisodeViewHolder>(EpisodeDiffCallback) {

    class EpisodeViewHolder(
        private val binding: ItemEpisodeBinding,
        private val listener: OnEpisodeListener
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(episode: Episode) {
            binding.apply {
                episodeName.text = episode.name
                episodeDuration.text = episode.duration
                image.setImageResource(
                    R.drawable.ic_image_placeholder_48
                )
                item.setOnClickListener {
                    listener.onEpisode(episode)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeViewHolder {
        val binding = ItemEpisodeBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return EpisodeViewHolder(binding, onEpisodeListener)
    }

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        val episode = getItem(position)
        holder.bind(episode)
    }
}

object EpisodeDiffCallback : DiffUtil.ItemCallback<Episode>() {
    override fun areItemsTheSame(oldItem: Episode, newItem: Episode): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Episode, newItem: Episode): Boolean {
        return oldItem.id == newItem.id
    }
}


