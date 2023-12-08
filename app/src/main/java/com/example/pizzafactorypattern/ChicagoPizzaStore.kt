package com.example.pizzafactorypattern

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(pizzaType: String): Pizza? {
        var pizza: Pizza? = null
        val pizzaIngredientFactory = ChicagoPizzaIngredientFactory()

        when (pizzaType) {
            "meat" -> {
                pizza = MeatPizza(pizzaIngredientFactory)
                pizza.name = "Chicago Style Meat Pizza"
            }

            "vegan" -> {
                pizza = VeganPizza(pizzaIngredientFactory)
                pizza.name = "Chicago Style Vegan Pizza"
            }
        }
        return pizza
    }
}