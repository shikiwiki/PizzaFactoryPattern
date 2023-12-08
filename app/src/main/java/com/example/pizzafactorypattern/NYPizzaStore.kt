package com.example.pizzafactorypattern

class NYPizzaStore : PizzaStore() {

    override fun createPizza(pizzaType: String): Pizza? {
        var pizza: Pizza? = null
        val pizzaIngredientFactory = NYPizzaIngredientFactory()

        when (pizzaType) {
            "meat" -> {
                pizza = MeatPizza(pizzaIngredientFactory)
                pizza.name = "New York Style Meat Pizza"
            }

            "vegan" -> {
                pizza = VeganPizza(pizzaIngredientFactory)
                pizza.name = "New York Style Vegan Pizza"
            }
        }
        return pizza
    }
}