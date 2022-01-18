package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.count.text = counter.toString()
        binding.plusOne.setOnClickListener {
            counter++
            binding.count.text = counter.toString()
        }

        binding.plusFive.setOnClickListener {
            counter += 5
            binding.count.text = counter.toString()
        }

        binding.minusOne.setOnClickListener {
            counter--
            binding.count.text = counter.toString()
        }

        binding.minusFive.setOnClickListener {
            counter -= 5
            binding.count.text = counter.toString()
        }

        binding.buttonReset.setOnClickListener {
            counter = 0
            binding.count.text = counter.toString()
        }

        setContentView(binding.root)
    }
}