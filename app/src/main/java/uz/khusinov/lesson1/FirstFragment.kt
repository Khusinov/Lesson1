package uz.khusinov.lesson1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import uz.khusinov.lesson1.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {

    private val binding by viewBinding { FragmentFirstBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {

            var text = edittext.text

            button.setOnClickListener {
                // we need to navigate here
                val bundle = Bundle()
                bundle.putString("text", text.toString())
                findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
            }
        }

    }

}