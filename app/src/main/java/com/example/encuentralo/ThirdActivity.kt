package com.example.encuentralo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.encuentralo.databinding.ActivityFourBinding
import com.example.encuentralo.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnchilis.setOnClickListener{
            val myIntent = Intent(this, FourActivity::class.java)
            startActivity(myIntent)
        }

    }
}