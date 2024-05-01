package numberBaseball.controller

import numberBaseball.logic.NumberProcessor
import numberBaseball.logic.contants.NumberBaseballEnum
import numberBaseball.logic.util.RandomNumberGenerator
import numberBaseball.logic.util.convertToIntList

class NumberBaseballController(
    private val numberProcessor: NumberProcessor,
    private val randomNumberGenerator: RandomNumberGenerator
) {
    fun start() {
        val randomNumber = randomNumberGenerator.generateRandomNumber(
            NumberBaseballEnum.GameSize.GAMESIZE.size,
            NumberBaseballEnum.RandomNumber.RANDOMNUMBERFROM.number,
            NumberBaseballEnum.RandomNumber.RANDOMNUMBERUNTIL.number
        )
        while (numberProcessor.processGameNumber(parseInputToIntList(),randomNumber))
        println("3개의 숫자를 모두 맞히셨습니다! 게임을 종료합니다.");
    }

    private fun parseInputToIntList(): MutableList<Int> {
        while (true) {
            print("숫자야구를 시작합니다. ")
            print("${NumberBaseballEnum.RandomNumber.RANDOMNUMBERFROM.number} ~ ${NumberBaseballEnum.RandomNumber.RANDOMNUMBERUNTIL.number-1}")
            println(" 사이의 ${NumberBaseballEnum.GameSize.GAMESIZE.size}자리 수를 입력해 주세요.")
            try {
                return readLine().toString().convertToIntList(NumberBaseballEnum.GameSize.GAMESIZE.size)
            } catch (e: Exception) {
                println(e.message)
                continue
            }
        }
    }
}