package com.example.mohamed.wasla.utils

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mohamed.wasla.R
import com.example.mohamed.wasla.model.docker

class MyAlertDialogFragment : DialogFragment() {


    val animals: ArrayList<docker> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
     savedInstanceState: Bundle?): View? {
            val rootView = inflater.inflate(R.layout.fraglayout, container)
            addAnimals()

        var rv_animal_list = rootView.findViewById(R.id.rv_animal_list) as RecyclerView
            // Creates a vertical Layout Manager
        rv_animal_list?.layoutManager = GridLayoutManager(activity,3)

            // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
//        rv_animal_list.layoutManager = GridLayoutManager(this, 2)

            // Access the RecyclerView Adapter and load the data into it
        rv_animal_list.adapter = AnimalAdapter(animals, this?.activity!!)

        return rootView
        }



    fun addAnimals() {
        animals.add(docker("Share",R.drawable.share))
        animals.add(docker("Private",R.drawable.unlock))
        animals.add(docker("Star",R.drawable.star))
        animals.add(docker("Pin",R.drawable.pin))
        animals.add(docker("Profile",R.drawable.person))
        animals.add(docker("Settings",R.drawable.setting))
        animals.add( docker("Contact us",R.drawable.balloon2))
        animals.add(docker("History",R.drawable.trash))
        animals.add(docker("About us",R.drawable.exclamation))
        animals.add(docker("ballon",R.drawable.balloongg))
    }

}