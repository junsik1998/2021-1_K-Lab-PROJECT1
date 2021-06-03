package com.example.gardening

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gardening.data.ParkData
import com.example.gardening.databinding.FragmentInfoBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class InfoFragment : Fragment(), OnMapReadyCallback {
    var parkArr = arrayOf(
        ParkData(
            LatLng(
                37.5445834335377,
                127.03743166984063
            ),
            "Seoul Forest Park",
            "Seoul Forest is a park located around 685 Seongsu-dong 1-ga, Seongdong-gu, Seoul. Originally a golf course and racecourse, it was completed in June 2005 with an investment of about 235.2 billion won to provide a resting space for citizens. The area is 1,156,498m2 (about 350,000 pyeong) and consists of 5 theme parks. The Han River and Jungnangcheon Stream flow near the park. It is the third largest park in Seoul after World Cup Park in Mapo-gu (1 million pyeong) and Olympic Park in Songpa-gu (500,000 pyeong).\nSeoul Forest consists of four distinctive spaces: Culture and Arts Park, Experience Learning Center, Ecological Forest, and Wetland Ecology Garden.\nIn addition, Seoul Forest Park is the first park with citizen participation from creation to program operation, and since November 2016, Seoul Green Trust Seoul Forest Conservancy has been responsible for the private operation of the park.",
             arrayListOf("sunflower","dandelion"),
             arrayListOf("tree_sparrow","swallow")
        ),
        ParkData(
            LatLng(
                37.54956150027909,
                127.0818336396154
            ),
            "Seoul Children's Grand Park",
            "Children's Grand Park is a resting space for families located in Neung-dong, Gwangjin-gu, Seoul, South Korea. It was opened on Children's Day on May 5, 1973. At about 530,000 square meters, it was the largest in Asia at the time of its opening. It is composed of green forest and green grass, and serves as a public park as a resting and cultural space for not only children, but also adolescents and general citizens. In addition, it functions as a learning and education center equipped with liberal arts facilities, a zoo, a bcal garden, and amusement facilities.",
            arrayListOf("lavander","rose"),
            arrayListOf("otter","chipmunk")
        ),
        ParkData(
            LatLng(37.551390337929895, 126.99099446067123),
            "Namsan Park",
            "Namsan is a symbol of Seoul located in the center of Seoul. Its height is 265m above sea level, and its original name was Ingyeongsan, but after King Taejo of the Joseon Dynasty moved the capital from Gaeseong to Seoul in 1394 by Pungsu geography, it was named 'Namsan' because it is a mountain in the south. It is an important mountain as Sangan. In order to hold a ritual to pray for the peace of the country, a shrine was built to enshrin the spirit of the mountain, and it was called Mokmyeok Shrine because it enshrined the mountain god of King Mokmyeok.\n" + "It was designated as a park on March 12, 1940 and opened on September 10, 1968. For 8 years from 1991, 89 negative facilities in the park were relocated and an outdoor botanical garden was created. Hoehyeon-dong and Hannam-dong, Yongsan-gu, have been extensively restored and maintained to provide rest and clean air to citizens, and this park has been reborn as a center of leisure life.",
            arrayListOf("dandelion","king_cherry"),
            arrayListOf("rabbit","tree_sparrow")
        ),
        ParkData(
            LatLng(
                37.50781156469194,
                126.99278932936299
            ),
            "Banpo Hangang Park",
            "Banpo Hangang Park is the first result of the Hangang Renaissance Project and is a park installed near Banpo Bridge. It consists of Jamsu Bridge, Sevit Island, Moonlight Rainbow Fountain, Moonlight Square, Seorae Island, Marina, Banpo Water Taxi Stand, and a picnic area.",
            arrayListOf("sunflower","king_cherry"),
            arrayListOf("tree_sparrow","cat")
        ),
        ParkData(
            LatLng(
                37.42643316373722,
                127.0227470918769
            ),
            "Seoul Grand Park",
            "Seoul Grand Park is a park located at 102 Grand Park Gwangjang-ro, Gwacheon-si, Gyeonggi-do, Republic of Korea. There is the largest zoo and botanical garden in Korea, and Seoul Land, an amusement park. It is located in Gwacheon, Gyeonggi-do, but the facility operation and management is in charge of Seoul Metropolitan Government.",
            arrayListOf("king_cherry","butterwort"),
            arrayListOf("otter","chipmunk")
        )
        )
    val plantExplains = mapOf<String, String>("sunflower" to "The sunflower is an annual plant belonging to the Asteraceae family, and the flower is a head flower.",
        "dandelion" to "Dandelion is a perennial herb distributed in Korea, China, and Japan.",
        "king_cherry" to "The King cherry tree is a tree in the Rosaceae family. It refers to the Japanese King cherry tree, which is a hybrid with the Jeju King cherry tree, which is native to Jeju Island.",
        "rose" to "A general term for shrubs in the genus Rosaceae. The height is 2~3m, and the leaves are alternate phyllotaxis and pinnate, and pink, pale purple, and white flowers bloom from May to June.",
        "butterwort" to "Common butterwort are perennial carnivorous plants that grow on wet rocks or marshes in the high mountains of northern Korea.",
        "lavander" to "Lavender is an evergreen perennial plant of the Lamiaceae family, native to the Mediterranean coast. Used in herbal teas, aromatherapy, and ornamental purposes."
    )

    val animalExplains = mapOf("tree_sparrow" to "A bird of the sparrow family. It is a common resident bird found in the vicinity.",
        "rabbit" to "Rabbit is a generic term for mammals belonging to the Leporidae family.",
        "otter" to "Body length 63–75 cm, tail length 41–55 cm, and weight 5.8–10 kg. It is similar in shape to a weasel, but much larger and suitable for aquatic life.",
        "chipmunk" to "Squirrels like chestnuts and acorns, so they damage chestnut production areas. In addition, the bark is removed to make nests, which hinders the growth of trees.",
        "swallow" to "The swallow is a migratory bird of the passeroptera family. They breed by making nests made of clay under cliffs or under eaves, and eat insects.",
        "cat" to "Cats are mammals belonging to the Carnivores feline family. Wild cats existed between 100,000 and 70,000 years ago."
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
        binding!!.apply {

            // park
            infoName.text = parkArr[select!!].name
            infoExpalinText.text = parkArr[select!!].explain

            // plant
            infoPlantName1.text = parkArr[select!!].plants[0]
            infoPlantName2.text = parkArr[select!!].plants[1]
            infoPlantImage1.setImageResource(resources.getIdentifier("plant_"+parkArr[select!!].plants[0], "drawable", activity?.packageName))
            infoPlantImage2.setImageResource(resources.getIdentifier("plant_"+parkArr[select!!].plants[1], "drawable", activity?.packageName))
            infoPlantExplain1.text = plantExplains[parkArr[select!!].plants[0]]
            infoPlantExplain2.text = plantExplains[parkArr[select!!].plants[1]]

            // animal

            infoAnimalName1.text = parkArr[select!!].animals[0]
            infoAnimalName2.text = parkArr[select!!].animals[1]
            infoAnimalImage1.setImageResource(resources.getIdentifier("animal_"+parkArr[select!!].animals[0], "drawable", activity?.packageName))
            infoAnimalImage2.setImageResource(resources.getIdentifier("animal_"+parkArr[select!!].animals[1], "drawable", activity?.packageName))
            infoAnimalExplain1.text = animalExplains[parkArr[select!!].animals[0]]
            infoAnimalExplain2.text = animalExplains[parkArr[select!!].animals[1]]
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