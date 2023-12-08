package com.example.pizzafactorypattern

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): String {
        return "Thin Crust Dough"
    }

    override fun createSauce(): String {
        return "Marinara Sauce"
    }

    override fun createCheese(): String {
        return "Reggiano Cheese"
    }

    override fun createMeat(): String {
        return "Beef Balls"
    }

    override fun createVeggies(): Array<String> {
        return arrayOf("Pepper", "Tomato", "Garlic", "Onion", "Mushroom")
    }

    override fun createSausage(): String {
        return "Pepperoni"
    }

    override fun createSeaProduct(): String {
        return "Clams"
    }

}