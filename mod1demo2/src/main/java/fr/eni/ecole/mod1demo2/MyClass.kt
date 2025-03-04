package fr.eni.ecole.mod1demo2

class Base


open class Apero(private var _name: String, var degree : Int) {

    var name : String
        get() = this._name;
        set(value) {
            this._name = value
        }

    open fun getCheers(cheers : String): String {
        return cheers
    }

    override fun toString(): String {
        return "Apero(name='$name', degree=$degree)"
    }
}
interface Samu{
    fun callPhone() : Int
    fun getSiren(): String {
        return "Pin Pon !";
    }
}

class HangOver(var headacheLvl : Int) : Apero("Happy Hour", 35), Samu{

    companion object{
        var glass = "un verre à pied !"
    }

    override fun callPhone(): Int {
        TODO("Not yet implemented")
    }



    override fun getCheers(cheers : String): String {
        return cheers + " A consommer avec prévention"
    }


    override fun toString(): String {
        return super.toString() + ", Mal de tête potentiel = ${this.headacheLvl}"
    }
}

fun main() {

    var mojito = Apero("Mojito", 20)
    println(mojito)
    println(mojito.getCheers("Mo mo rito !"))
    println(mojito.name)

    var ho = HangOver(8)
    println(ho)
    println(ho.getCheers("C'est l'happy hour !"))

    print(HangOver.glass)

}

