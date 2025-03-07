package fr.eni.ecole.mod4tp1

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlin.random.Random

class DiceViewModel : ViewModel() {

    private var _totalLaunch = MutableStateFlow<Int>(0)
    var totalLaunch: StateFlow<Int> = _totalLaunch

    var nbThrowLeft: Int = 0
    var nbThrowRight: Int = 0
    var totalLeft: Int = 0
    var totalRight: Int = 0
    var diceImageId = R.drawable.d6

    fun rollDice(): Int {

        val currentRoll = (1..6).random()
        _totalLaunch.value++

        diceImageId = when (currentRoll) {
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            else -> R.drawable.d6
        }

        return currentRoll
    }

    fun rollLeft() {
        totalLeft += rollDice()
        nbThrowLeft++
    }

    fun rollRight() {
        totalRight += rollDice()
        nbThrowRight++
    }

    fun reset() {

        _totalLaunch.value = 0

        nbThrowLeft = 0
        nbThrowRight = 0
        totalLeft = 0
        totalRight = 0
        diceImageId = R.drawable.d6
    }

}