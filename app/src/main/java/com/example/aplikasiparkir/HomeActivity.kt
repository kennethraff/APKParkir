package com.example.aplikasiparkir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasiparkir.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

                supportActionBar?.hide()
                listener()
    }

    private fun listener(){
        binding.buttonStartHomeActivity.setOnClickListener() {
            val myIntent = Intent(this, LogInActivity::class.java)
            startActivity(myIntent)
        }
    }
}