package com.example.gardening

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gardening.databinding.FragmentSnsBinding

class SnsFragment : Fragment() {
    lateinit var binding:FragmentSnsBinding
    var select :Int? = null
    val parkList = arrayOf(
        "Seoul Forest Park",
        "Seoul Children's Grand Park",
        "Namsan Park",
        "Banpo Hangang Park",
        "Seoul Grand Park"
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSnsBinding.inflate(layoutInflater)
        select = arguments?.getString("select")?.toInt()
        return binding!!.root
    }


    override fun onResume() {
        super.onResume()
        binding.apply{
            snsLocation.text = parkList[select!!]
            snsLocation1.text = parkList[select!!]
            snsLocation2.text = parkList[select!!]



            snsArticle1.setOnClickListener {
                val intent = Intent(activity, SnsActivity::class.java)
                intent.putExtra("date", "2020-05-21")
                intent.putExtra("writer", "Andrew")
                intent.putExtra("park", parkList[select!!])
                intent.putExtra("select" ,0)
                startActivity(intent)
            }
            snsArticle2.setOnClickListener {
                val intent = Intent(activity, SnsActivity::class.java)
                intent.putExtra("date", "2020-05-22")
                intent.putExtra("writer", "Michel")
                intent.putExtra("park", parkList[select!!])
                intent.putExtra("select" ,1)
                startActivity(intent)
            }
            snsArticle3.setOnClickListener {
                val intent = Intent(activity, SnsActivity::class.java)
                intent.putExtra("date", "2020-05-24")
                intent.putExtra("writer", "Andrew")
                intent.putExtra("park", parkList[select!!])
                intent.putExtra("select" ,2)
                startActivity(intent)
            }
        }
    }
}