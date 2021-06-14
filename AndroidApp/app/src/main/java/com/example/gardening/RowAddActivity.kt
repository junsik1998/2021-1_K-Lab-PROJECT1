package com.example.gardening

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gardening.databinding.ActivityRowAddBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*

class RowAddActivity : AppCompatActivity() {
    lateinit var binding: ActivityRowAddBinding
    lateinit var rdb: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRowAddBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun editTextClear(){
        binding.apply {
            addTitleEditText.text.clear()
            addFullEditText.text.clear()
            addDateEditText.text.clear()
        }
    }
    private fun init() {
        rdb = FirebaseDatabase.getInstance().getReference("Row/row")
        binding.apply {
            addCancel.setOnClickListener {
                editTextClear()
                finish()
            }

            addRow.setOnClickListener {
                val random = Random()
                val title = addTitleEditText.text.toString()
                 val fullNum = addFullEditText.text.toString().toInt()
                val date = addDateEditText.text.toString()
                val id = random.nextInt(999999)
                 val values = ActivityRowComponent(id,title,"",1,fullNum,"Randomshot",date,"",0)
                rdb.child(id.toString()).setValue(values)
                editTextClear()
                finish()
            }
        }
    }
}