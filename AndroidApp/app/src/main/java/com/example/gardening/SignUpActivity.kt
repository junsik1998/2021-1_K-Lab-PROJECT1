package com.example.gardening

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gardening.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init(){
        binding.apply{
            signupBtn.setOnClickListener{
                finish()
            }
        }
    }
}