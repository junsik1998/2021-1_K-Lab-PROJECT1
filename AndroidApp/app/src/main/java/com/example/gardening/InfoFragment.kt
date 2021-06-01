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
    var parkArr = arrayOf(ParkData(LatLng(37.5445834335377, 127.03743166984063),"Seoul Forest Park", "Seoul Forest is a park located around 685 Seongsu-dong 1-ga, Seongdong-gu, Seoul. Originally a golf course and racecourse, it was completed in June 2005 with an investment of about 235.2 billion won to provide a resting space for citizens. The area is 1,156,498m2 (about 350,000 pyeong) and consists of 5 theme parks. The Han River and Jungnangcheon Stream flow near the park. It is the third largest park in Seoul after World Cup Park in Mapo-gu (1 million pyeong) and Olympic Park in Songpa-gu (500,000 pyeong).\nSeoul Forest consists of four distinctive spaces: Culture and Arts Park, Experience Learning Center, Ecological Forest, and Wetland Ecology Garden.\nIn addition, Seoul Forest Park is the first park with citizen participation from creation to program operation, and since November 2016, Seoul Green Trust Seoul Forest Conservancy has been responsible for the private operation of the park."),
                            ParkData(LatLng(37.54956150027909, 127.0818336396154),"Seoul Children's Grand Park", "Children's Grand Park is a resting space for families located in Neung-dong, Gwangjin-gu, Seoul, South Korea. It was opened on Children's Day on May 5, 1973. At about 530,000 square meters, it was the largest in Asia at the time of its opening. It is composed of green forest and green grass, and serves as a public park as a resting and cultural space for not only children, but also adolescents and general citizens. In addition, it functions as a learning and education center equipped with liberal arts facilities, a zoo, a botanical garden, and amusement facilities."),
                            ParkData(LatLng(37.551390337929895, 126.99099446067123),"Namsan Park", "Namsan is a symbol of Seoul located in the center of Seoul. Its height is 265m above sea level, and its original name was Ingyeongsan, but after King Taejo of the Joseon Dynasty moved the capital from Gaeseong to Seoul in 1394 by Pungsu geography, it was named 'Namsan' because it is a mountain in the south. It is an important mountain as Sangan. In order to hold a ritual to pray for the peace of the country, a shrine was built to enshrin the spirit of the mountain, and it was called Mokmyeok Shrine because it enshrined the mountain god of King Mokmyeok.\n" + "It was designated as a park on March 12, 1940 and opened on September 10, 1968. For 8 years from 1991, 89 negative facilities in the park were relocated and an outdoor botanical garden was created. Hoehyeon-dong and Hannam-dong, Yongsan-gu, have been extensively restored and maintained to provide rest and clean air to citizens, and this park has been reborn as a center of leisure life."),
                            ParkData(LatLng(37.50781156469194, 126.99278932936299),"Banpo Hangang Park", "Banpo Hangang Park is the first result of the Hangang Renaissance Project and is a park installed near Banpo Bridge. It consists of Jamsu Bridge, Sevit Island, Moonlight Rainbow Fountain, Moonlight Square, Seorae Island, Marina, Banpo Water Taxi Stand, and a picnic area."),
                            ParkData(LatLng(37.42643316373722, 127.0227470918769),"Seoul Grand Park","Seoul Grand Park is a park located at 102 Grand Park Gwangjang-ro, Gwacheon-si, Gyeonggi-do, Republic of Korea. There is the largest zoo and botanical garden in Korea, and Seoul Land, an amusement park. It is located in Gwacheon, Gyeonggi-do, but the facility operation and management is in charge of Seoul Metropolitan Government.")
        )

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
        binding!!.apply{
            infoName.text = parkArr[select!!].name
            infoExpalinText.text = parkArr[select!!].explain
        }
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
        val myLocation = parkArr[select!!].loc
        googleMap?.moveCamera(CameraUpdateFactory.newLatLng(myLocation))
        googleMap?.moveCamera(CameraUpdateFactory.zoomTo(10.0f))

        val marker = MarkerOptions()
                    .position(myLocation)
            .title("Seoul")
            .snippet("ISeoulU")

        googleMap?.addMarker(marker)
    }
}