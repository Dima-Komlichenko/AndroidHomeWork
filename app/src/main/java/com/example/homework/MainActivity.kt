package com.example.homework

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var mlsDifference: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btn.setOnClickListener {
            Log.i("btnClick", "The button has been clicked")
        }

        mlsDifference = System.currentTimeMillis()
        Log.i("lifecycle", "onCreate() ${0}")
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle", "onStart() ${System.currentTimeMillis() - mlsDifference}")

    }

    override fun onResume() {
        super.onResume()
        Log.i("lifecycle", "onResume() ${System.currentTimeMillis() - mlsDifference}")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifecycle", "onPause() ${System.currentTimeMillis() - mlsDifference}")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifecycle", "onStop() ${System.currentTimeMillis() - mlsDifference}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifecycle", "onDestroy() ${System.currentTimeMillis() - mlsDifference}")
    }
}