package com.example.gardening

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gardening.databinding.ActivitySnsBinding

class SnsActivity : AppCompatActivity() {
    lateinit var binding: ActivitySnsBinding
    val imgArr = arrayOf("sns_cat", "sns_tree", "sns_sunflower")
    val comment = arrayOf(
        "I was walking in the park today and I saw a cute cat!",
        "That tree in this park always seems to protect us!",
        "I think these sunflowers are really pretty!"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySnsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    fun init(){
        val intent = intent
        val date = intent.getStringExtra("date")
        val writer = intent.getStringExtra("writer")
        val park = intent.getStringExtra("park")
        val select = intent.getIntExtra("select", 0)

        binding.apply{
            snsDateText.text = date
            snsWriterText.text = writer
            snsParkText.text = park

            snsImageView.setImageResource(resources.getIdentifier(imgArr[select], "drawable", packageName))

            snsContent.text = comment[select]
        }
    }

}