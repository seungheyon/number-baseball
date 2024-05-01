package numberBaseball.logic.util

import kotlin.random.Random

class RandomNumberGenerator {
    fun generateRandomNumber(gameSize : Int, randomFrom : Int, randomUntil : Int) : List<Int>{
        val randomNumbers: MutableList<Int> = ArrayList()
        while (randomNumbers.size < gameSize) {
            val randomNumber: Int = Random.nextInt(randomFrom, randomUntil)
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber)
            }
        }
        return randomNumbers
    }
}