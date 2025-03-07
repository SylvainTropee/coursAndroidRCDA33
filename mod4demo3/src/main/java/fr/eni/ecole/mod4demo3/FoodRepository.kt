package fr.eni.ecole.mod4demo3

class FoodRepository {

    private val foods = listOf(
        "Burger",
        "Pizza",
        "Tartiflette",
        "No vegetables",
        "Burger aux lasagnes"
    )

    fun getFoods(): List<String> {
        return foods
    }

}