package com.example.gardening

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gardening.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    lateinit var binding:ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init(){
        binding!!.apply{
            introMoveBtn.setOnClickListener{
                val intent = Intent(this@IntroActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}