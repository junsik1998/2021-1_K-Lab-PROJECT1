package com.example.gardening.data

import com.google.android.gms.maps.model.LatLng

data class ParkData(
    val loc: LatLng,
    val name : String,
    val explain:String,
    val plants:ArrayList<String>,
    val animals:ArrayList<String>
)