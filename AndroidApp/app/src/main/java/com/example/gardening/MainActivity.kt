package com.example.gardening

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.gardening.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

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
                        //Toast.makeText(this@MainActivity, "SNS", Toast.LENGTH_SHORT).show()
                        true
                    }
                    else->{
                        //Toast.makeText(this@MainActivity, "SNS", Toast.LENGTH_SHORT).show()
                        false
                    }
                }

            }
        }
    }
}