package com.example.android2extrahomework1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android2extrahomework1.databinding.FragmentHomeBinding
import com.example.android2extrahomework1.setBackStackData

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpListener()
    }

    private fun setUpListener() {
        binding.buttonAddText.setOnClickListener {
            val inputText = binding.editTextInputText.text.toString()
            setBackStackData("key", inputText, true)
            findNavController().navigateUp()
        }
    }
}
