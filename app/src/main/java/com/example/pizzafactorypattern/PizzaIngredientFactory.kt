package com.example.pizzafactorypattern

interface PizzaIngredientFactory {

    fun createDough(): String
    fun createSauce(): String
    fun createCheese(): String
    fun createMeat(): String
    fun createSausage(): String
    fun createSeaProduct(): String
    fun createVeggies(): Array<String>
}