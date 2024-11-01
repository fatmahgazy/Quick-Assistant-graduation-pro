package org.codeforegypt.quickassestant.ui.splachFragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.codeforegypt.quickassestant.R
import org.codeforegypt.quickassestant.databinding.FragmentFirstSplachBinding


@AndroidEntryPoint
class FirstSplashFragment : Fragment() {

    val viewModel: FirstSplashViewModel by viewModels()

   private var _binding: FragmentFirstSplachBinding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstSplachBinding.inflate(inflater, container, false)
        viewLifecycleOwner.lifecycleScope.launch {
            binding.flLoading.isVisible = true
            delay(1000)
            val sharedPreferences = requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
            val hasSeenSplash = sharedPreferences.getBoolean("hasSeenSplash", false)
            binding.flLoading.isVisible = false
            if ( hasSeenSplash && viewModel.userExist) {
                // If the user has seen the splash screen, navigate to the next destination
                findNavController().navigate(R.id.action_moreFragment2_to_firstSplachFragment3)
                return@launch

            } //else if (hasSeenSplash)
               // findNavController().navigate(R.id.firstSplachFragment)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_firstSplachFragment_to_secondFragment)
        }
        val sharedPreferences =
            requireActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        with(sharedPreferences.edit()) {
            putBoolean("hasSeenSplash", true)
            apply()
        }
    }
}