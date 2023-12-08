package com.example.pizzafactorypattern

import android.util.Log

class VeganPizza(private var ingredientFactory: PizzaIngredientFactory) : Pizza() {
    private val TAG = "VeggiePizza.class"

    override fun prepare() {
        Log.i(TAG, "Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}