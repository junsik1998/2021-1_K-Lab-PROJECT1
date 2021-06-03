package com.example.gardening

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.gardening.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    lateinit var binding: ActivityMainBinding
    var select:Int ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setFragment(InfoFragment())
        init()
        select = intent.getStringExtra("select")?.toInt()
        Log.i("RADIO", select.toString())
    }

    fun setDataAtFragment(fragment: Fragment, select:Int){
        val bundle =Bundle()
        bundle.putString("select", select.toString())
        fragment.arguments = bundle
        setFragment(fragment)
    }

    fun setDataAtFragment(fragment: Fragment, type:String){
        //kinds : all, wrong ,favorites
        val bundle = Bundle()
        bundle.putString("type",type)
        fragment.arguments = bundle
        setFragment(fragment)

    }
    fun setFragment(fragment:Fragment){
        val transaction =supportFragmentManager.beginTransaction()
        transaction.replace(R.id.navigationFrameLayout,fragment)
        transaction.commit()
    }

    private fun init() {
        binding.apply {
            bottomNavigationView.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.InfoMenuBtn -> {
                        setDataAtFragment(InfoFragment(), select!!)
                        //Toast.makeText(this@MainActivity, "info", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.ActivityMenuBtn -> {
                        setFragment(ActivityListFragment())
                        //Toast.makeText(this@MainActivity, "Activity", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.MyMenuBtn -> {
                        setDataAtFragment(ActivityListFragment(),"My")
                        //Toast.makeText(this@MainActivity, "My", Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.SNSMenuBtn -> {
                        setDataAtFragment(SnsFragment(), select!!)
                        true
                    }
                    else->{
                        //Toast.makeText(this@MainActivity, "SNS", Toast.LENGTH_SHORT).show()
                        false
                    }
                }
            }
            bottomNavigationView.selectedItemId = R.id.ActivityMenuBtn
        }
    }
}