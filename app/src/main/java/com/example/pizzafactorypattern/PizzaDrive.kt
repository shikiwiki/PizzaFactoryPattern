package com.example.pizzafactorypattern

import android.util.Log

const val TAG = "Main.class"

fun main() {
    val myPizza: Pizza = NYPizzaStore().orderPizza("vegan")
    Log.i(TAG, "I ordered ${myPizza.name}")

    val yourPizza: Pizza = ChicagoPizzaStore().orderPizza("meat")
    Log.i(TAG, "You ordered ${yourPizza.name}")
}