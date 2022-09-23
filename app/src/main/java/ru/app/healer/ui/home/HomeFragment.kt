package ru.app.healer.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.app.healer.data.dto.Episode
import ru.app.healer.databinding.FragmentHomeBinding
import ru.app.healer.ui.home.adapter.ListEpisodeAdapter
import ru.app.healer.ui.home.adapter.OnEpisodeListener

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val adapter = ListEpisodeAdapter(object : OnEpisodeListener {
            override fun onEpisode(episode: Episode) {
                //FIXME ("Not yet implemented")
            }
        })
        binding.list.adapter = adapter
        homeViewModel.data.observe(viewLifecycleOwner) { episodes ->
            adapter.submitList(episodes)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}