package com.example.gardening

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.gardening.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    lateinit var binding:ActivityIntroBinding
    var select :Int ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

    }
    private fun init(){
        binding!!.apply{
            introMoveBtn.setOnClickListener{
                when(radioGroup.checkedRadioButtonId){
                    R.id.radioButton0-> select = 0
                    R.id.radioButton1-> select = 1
                    R.id.radioButton2-> select = 2
                    R.id.radioButton3-> select = 3
                    R.id.radioButton4-> select = 4
                }
                val intent = Intent(this@IntroActivity, MainActivity::class.java)
                intent.putExtra("select", select.toString())
                startActivity(intent)
            }
        }
    }
}