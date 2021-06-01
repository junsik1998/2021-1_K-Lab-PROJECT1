package com.example.gardening

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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
    lateinit var adapter2: MyAdapter2
    lateinit var rdb: DatabaseReference
    lateinit var rdb2: DatabaseReference
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
        rdb2 = FirebaseDatabase.getInstance().getReference("Row/selected")
        binding!!.activityListRecyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
        val query = rdb.limitToFirst(100)
        val option = FirebaseRecyclerOptions.Builder<ActivityRowComponent>()
            .setQuery(query, ActivityRowComponent::class.java)
            .build()
        adapter = MyAdapter(option)

        adapter.itemClickListener = object:MyAdapter.OnItemClickListener{
            override fun OnItemClick(holder: MyAdapter.ViewHolder, view:View, position: Int) {

            }
        }

        adapter.buttonClickListener = object :MyAdapter.OnButtonClickListener{
            override fun OnButtonClick(holder: MyAdapter.ViewHolder, view: View, position: Int) {
                if(holder.selected == 1){
                    Toast.makeText(activity,"Already Selected",Toast.LENGTH_SHORT).show()
                }
                else if(holder.currentNum +1 <= holder.fullNum){

                    val values = ActivityRowComponent(holder.aId,holder.title.text.toString(),holder.content,holder.currentNum+1,holder.fullNum,"Randomshot",holder.date.text.toString(),holder.comment,1)
                    rdb.child(holder.aId.toString()).removeValue()
                    rdb.child(holder.aId.toString()).setValue(values)
                    rdb2.child(holder.aId.toString()).setValue(values)
                    holder.selected = 1
                }

                else{
                    Toast.makeText(activity,"It's already full",Toast.LENGTH_SHORT).show()
                }
            }
        }
        binding!!.activityListRecyclerView.adapter = adapter

        adapter.startListening()
    }

    private fun initMyRecyclerView(){
        rdb = FirebaseDatabase.getInstance().getReference("Row/row")
        rdb2 = FirebaseDatabase.getInstance().getReference("Row/selected")
        binding!!.activityListRecyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)


        val query = rdb2.limitToFirst(100)
        val option = FirebaseRecyclerOptions.Builder<ActivityRowComponent>()
            .setQuery(query, ActivityRowComponent::class.java)
            .build()
        adapter2 = MyAdapter2(option)


        adapter2.itemClickListener = object:MyAdapter2.OnItemClickListener{
            override fun OnItemClick(holder: MyAdapter2.ViewHolder, view:View, position: Int) {

            }
        }
        adapter2.buttonClickListener = object :MyAdapter2.OnButtonClickListener{
            override fun OnButtonClick(holder: MyAdapter2.ViewHolder, view: View, position: Int) {


                    val values = ActivityRowComponent(holder.aId,holder.title.text.toString(),holder.content,holder.currentNum-1,holder.fullNum,"Randomshot",holder.date.text.toString(),holder.comment,0)
                    holder.selected = 0
                    rdb.child(holder.aId.toString()).setValue(values)
                    rdb2.child(holder.aId.toString()).removeValue()

            }

        }

        binding!!.activityListRecyclerView.adapter = adapter2

        adapter2.startListening()


    }



}