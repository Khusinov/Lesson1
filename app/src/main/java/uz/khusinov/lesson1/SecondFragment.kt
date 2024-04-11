package uz.khusinov.lesson1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.khusinov.lesson1.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {

    private val binding by viewBinding { FragmentSecondBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {

            val text = arguments?.getString("text")

            tv.text = text.toString()
        }
    }
}