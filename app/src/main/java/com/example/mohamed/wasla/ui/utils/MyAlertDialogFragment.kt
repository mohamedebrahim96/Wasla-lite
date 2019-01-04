package com.example.mohamed.wasla.ui.utils

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mohamed.wasla.R
import kotlinx.android.synthetic.main.fraglayout.*

class MyAlertDialogFragment : DialogFragment() {


    val animals: ArrayList<String> = ArrayList()

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
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
        animals.add("lion")
        animals.add("tiger")
        animals.add("horse")
        animals.add("frog")
        animals.add("fish")
        animals.add("shark")
        animals.add("turtle")
        animals.add("elephant")
        animals.add("cow")
        animals.add("beaver")
        animals.add("bison")
        animals.add("porcupine")
        animals.add("rat")
        animals.add("mouse")
        animals.add("goose")
        animals.add("deer")
        animals.add("fox")
        animals.add("moose")
        animals.add("buffalo")
        animals.add("monkey")
        animals.add("penguin")
        animals.add("parrot")
    }

}