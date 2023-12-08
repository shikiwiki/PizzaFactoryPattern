package com.example.pizzafactorypattern

import android.util.Log

abstract class Pizza {
    private val TAG = "Pizza.class"

    lateinit var name: String
    lateinit var dough: String
    lateinit var sauce: String
    lateinit var cheese: String
    lateinit var mainStuff: String
    var veggies: ArrayList<String> = ArrayList()

    abstract fun prepare()
//    {
//        Log.i(TAG, "Preparing $name")
//        Log.i(TAG, "Tossing dough")
//        Log.i(TAG, "Adding ingredients")
//    }

    fun bake() {
        Log.i(TAG, "Bake for 25 min at 350")
    }

    open fun cut() {
        Log.i(TAG, "Cutting ine diagonal slices")
    }

    fun box() {
        Log.i(TAG, "Placing pizza into Brand Box")
    }
}