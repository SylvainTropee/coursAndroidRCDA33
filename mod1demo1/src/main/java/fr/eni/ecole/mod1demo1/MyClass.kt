package fr.eni.ecole.mod1demo1

//fun main() {
//    print("Hello World !")
//
//    //déclaration de variables
//    var name: String? = null
//    //name = 12 // pas possible
//    name = "Michel"
//
//    //constante
//    val COFFEE: String
//    COFFEE = "Café ?"
//    //COFFEE = "Thé" //pas possible
//
//
//}


//fun main(){
//
//    var null1 : String? = null
//    var null2 = null
//
//    println(null1?.length ?: "Pas de taille")
//    println(null2)
//
//}

//fun main() {
//
//    var world = " world !"
//
//    val message by lazy {  "Hello $world" }
//
//    //println(message)
//
//    world = " man !"
//
//    println(message)
//}

//fun main() {
//
//    //conditions
//    val AGE = 250
//    val message = if(AGE >= 18) "Majeur !" else "Mineur"
//    println(message)
//
//    when(AGE){
//        0,1,2 -> println("C'est un bébé !")
//        in 1..18 -> println("C'est un mineur !")
//        is Int -> println("C'est un majeur")
//        else -> println("Autre truc")
//    }
//}

//fun main() {
//    //boucles
//
//    val powers = listOf("Vol", "Invisibilité", "Force", "Pyrokinésie")
//
//    for(p in powers){
//        println(p)
//    }
//
//    for(i in 0..< powers.size){
//        println(powers[i]) //powers.get(i)
//    }
//
//    for(j in 10 downTo 1 step 2){
//        println(j)
//    }
//
//}


fun main() {
    //fonctions

    val articles = List(30) { id ->
        //"Article $it"
        "Article $id"
    }

    val colors = mutableListOf<String>()
    colors.add("cornflowerblue")
    colors += "yellow"
    colors += "red !"
    colors += "yellow"

    var nbColor = colors.filter {
        it == "yellow"
    }.count()

    println(nbColor)


    fun String.sayHello(){
        println("Hello $this")
    }

    "Michel".sayHello()


}


















