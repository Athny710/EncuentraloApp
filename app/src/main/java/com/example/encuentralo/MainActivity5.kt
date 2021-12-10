package com.example.encuentralo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.encuentralo.databinding.ActivityFourBinding
import com.example.encuentralo.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {

    private lateinit var binding: ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val myIntent = Intent(this, FourActivity::class.java)
            startActivity(myIntent)
        }
    }
}