package com.example.pizzafactorypattern

import android.util.Log

class MeatPizza(private val ingredientFactory: PizzaIngredientFactory) : Pizza() {
    private val TAG = "MeatPizza.class"

    override fun prepare() {
        Log.i(TAG, "Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}