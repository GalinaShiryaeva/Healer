package ru.app.healer.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.app.healer.databinding.FragmentEditEpisodeBinding
import ru.app.healer.domain.utils.StringArg

class EditEpisodeFragment : Fragment() {

    //    private val homeViewModel: HomeViewModel(
//            ownerProducer = ::requireParentFragment
//    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentEditEpisodeBinding.inflate(
            inflater,
            container,
            false
        )
        arguments?.nameArg?.let {
            binding.nameText.setText(it)
        }
        arguments?.durationArg.let {
            binding.durationText.setText(it)
        }
        return binding.root
    }

    companion object {
        var Bundle.nameArg: String? by StringArg
        var Bundle.durationArg: String? by StringArg // FIXME("must be of type Data or something")
    }
}