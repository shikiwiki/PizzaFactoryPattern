package com.example.pizzafactorypattern

abstract class PizzaStore {

    abstract fun createPizza(pizzaType: String): Pizza?

    open fun orderPizza(pizzaType: String): Pizza {
        val pizza : Pizza = createPizza(pizzaType)!!
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }
}