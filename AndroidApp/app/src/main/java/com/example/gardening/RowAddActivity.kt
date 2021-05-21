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
            addContentEditText.text.clear()
        }
    }
    private fun init() {
        rdb = FirebaseDatabase.getInstance().getReference("Row/row")
        binding.apply {
            addCancel.setOnClickListener {
                editTextClear()
            }

            addRow.setOnClickListener {
                val random = Random()
                val title = addTitleEditText.text.toString()
                 val fullNum = addFullEditText.text.toString().toInt()
                val date = addDateEditText.text.toString()
                 val content = addContentEditText.text.toString()
                 val values = ActivityRowComponent(title,content,1,fullNum,"Randomshot",date,"")
                rdb.child(random.nextInt(999999).toString()).setValue(values)
                editTextClear()
            }
        }
    }
}