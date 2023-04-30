package com.example.android2extrahomework1.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android2extrahomework1.R
import com.example.android2extrahomework1.databinding.FragmentTextBinding
import com.example.android2extrahomework1.getBackStackData
import com.example.android2extrahomework1.ui.adapters.TextAdapter

class TextFragment : Fragment() {

    private lateinit var binding: FragmentTextBinding
    private lateinit var textAdapter: TextAdapter
    private var list = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTextBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialization()
        setData()
        setUpListener()
    }

    private fun initialization() {
        textAdapter = TextAdapter(list)
        binding.recyclerView.apply {
            adapter = textAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun setData() {
        getBackStackData<String>("key") {
            Log.d("HomeFragment", "Data added to back stack")
            list.add(it)
            textAdapter.addItem(list)
        }
    }

    private fun setUpListener() {
        binding.buttonBackOnHomeFragment.setOnClickListener {
            findNavController().navigate(R.id.action_textFragment_to_homeFragment)
        }
    }
}