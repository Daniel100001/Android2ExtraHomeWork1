package com.example.android2extrahomework1.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android2extrahomework1.R
import com.example.android2extrahomework1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}