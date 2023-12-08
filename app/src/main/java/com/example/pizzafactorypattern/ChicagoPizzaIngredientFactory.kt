package com.example.pizzafactorypattern

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough(): String {
        return "Extra Thick Crust Dough"
    }

    override fun createSauce(): String {
        return "Plum Tomato Sauce"
    }

    override fun createCheese(): String {
        return "Shredded Mozzarella Cheese"
    }

    override fun createMeat(): String {
        return "Pork Balls"
    }

    override fun createVeggies(): Array<String> {
        return arrayOf("Bell Pepper", "Tomato", "Chili", "Onion", "Mushroom")
    }

    override fun createSausage(): String {
        return "Chorizo"
    }

    override fun createSeaProduct(): String {
        return "Red Salmon"
    }

}