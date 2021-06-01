package com.example.gardening

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gardening.databinding.FragmentInfoBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class InfoFragment : Fragment(), OnMapReadyCallback {

    var locArr =  arrayOf(LatLng(53.37503235738614, 6.173195461374293),LatLng(37.429347415772234, 127.01603054100286))
    var binding :FragmentInfoBinding ? = null
    var select :Int? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoBinding.inflate(layoutInflater, container, false)
        binding!!.infoMap.onCreate(savedInstanceState)
        binding!!.infoMap.getMapAsync(this)




        return binding!!.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        select = arguments?.getString("select")?.toInt()
        Log.i("TEST", "num : ${select.toString()}")
    }

    override fun onResume() {
        super.onResume()
        binding!!.infoMap.onResume()
    }

    override fun onPause() {
        super.onPause()
        binding!!.infoMap.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        binding!!.infoMap.onSaveInstanceState(outState)
    }

    override fun onLowMemory() {
        super.onLowMemory()
        binding!!.infoMap.onLowMemory()
    }



    override fun onDestroy() {
        super.onDestroy()
        binding!!.infoMap.onDestroy()
        binding = null
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        val myLocation = locArr[select!!]
        googleMap?.moveCamera(CameraUpdateFactory.newLatLng(myLocation))
        googleMap?.moveCamera(CameraUpdateFactory.zoomTo(10.0f))

        val marker = MarkerOptions()
                    .position(myLocation)
            .title("Seoul")
            .snippet("ISeoulU")

        googleMap?.addMarker(marker)
    }
}