package numberBaseball.logic.util

import kotlin.random.Random

class RandomNumberGenerator {
    fun generateRandomNumber(gameSize: Int, randomFrom: Int, randomUntil: Int): List<Int> {
        val randomNumbers: MutableList<Int> = ArrayList()
        while (randomNumbers.size < gameSize) {
            val randomNumber: Int = Random.nextInt(randomFrom, randomUntil)
            if(randomNumbers.size<1&&randomNumber==0){
                continue
            }
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber)
            }
        }
        return randomNumbers
    }
}