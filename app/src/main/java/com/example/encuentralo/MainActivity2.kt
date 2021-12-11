package com.example.encuentralo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.encuentralo.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageButton3.setOnClickListener {
            //Aqui va el activity de la tercera parte
            //Reemplazar el ActivityMain2Binding por el de la actividad 3 (vista 3)
            val myIntent = Intent(this, ThirdActivity::class.java)
            startActivity(myIntent)
        }
    }
}