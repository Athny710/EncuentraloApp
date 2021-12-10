package com.example.encuentralo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import com.example.encuentralo.databinding.ActivityFourBinding

class FourActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btfav.setOnClickListener{
            Toast.makeText(
                applicationContext,
                "Lugar añadido a favoritos",
                Toast.LENGTH_SHORT
            ).show()
        }
        /*
        binding.btEncontrar.setOnClickListener {
            val myIntent = Intent(this, FiftActivity::class.java)
            startActivity(myIntent)
        }
         */
    }
}