package com.example.gardening

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gardening.databinding.FragmentActivityListBinding
import com.firebase.ui.database.FirebaseRecyclerOptions
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

/**
 * A simple [Fragment] subclass.
 * Use the [ActivityListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ActivityListFragment : Fragment() {
    lateinit var adapter:MyAdapter
    lateinit var rdb: DatabaseReference
    private var type:String?=null
    var binding:FragmentActivityListBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        type = arguments?.getString("type")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentActivityListBinding.inflate(layoutInflater)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(type.equals("My")) initMyRecyclerView()
        else initRecyclerView()
        init()
    }
    private fun init() {

        binding!!.addActivityRowBtn.setOnClickListener {
            val intent = Intent(activity, RowAddActivity::class.java)
            startActivity(intent)
        }


    }

    private fun initRecyclerView(){
        rdb = FirebaseDatabase.getInstance().getReference("Row/row")
        binding!!.activityListRecyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
        val query = rdb.limitToFirst(100)
        val option = FirebaseRecyclerOptions.Builder<ActivityRowComponent>()
            .setQuery(query, ActivityRowComponent::class.java)
            .build()
        adapter = MyAdapter(option)

        adapter.itemClickListener = object:MyAdapter.OnItemClickListener{
            override fun OnItemClick(view: View, position: Int) {

            }
        }

        binding!!.activityListRecyclerView.adapter = adapter

        adapter.startListening()
    }

    private fun initMyRecyclerView(){
        rdb = FirebaseDatabase.getInstance().getReference("Row/row")
        binding!!.activityListRecyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
        val query = rdb.limitToFirst(3)
        val option = FirebaseRecyclerOptions.Builder<ActivityRowComponent>()
            .setQuery(query, ActivityRowComponent::class.java)
            .build()
        adapter = MyAdapter(option)

        adapter.itemClickListener = object:MyAdapter.OnItemClickListener{
            override fun OnItemClick(view: View, position: Int) {

            }
        }

        binding!!.activityListRecyclerView.adapter = adapter

        adapter.startListening()
    }



}