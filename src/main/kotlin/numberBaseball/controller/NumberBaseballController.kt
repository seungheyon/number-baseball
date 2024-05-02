package numberBaseball.controller

import numberBaseball.logic.numberProcessor.NumberProcessor
import numberBaseball.logic.contants.NumberBaseballEnum
import numberBaseball.logic.numberProcessor.ResultTransferObject
import numberBaseball.logic.util.RandomNumberGenerator
import numberBaseball.logic.util.convertToIntList

class NumberBaseballController(
    private val numberProcessor: NumberProcessor,
    private val randomNumberGenerator: RandomNumberGenerator
) {
    fun start() {
        println("숫자야구를 시작합니다. ")
        val randomNumber = randomNumberGenerator.generateRandomNumber(
            NumberBaseballEnum.GameSize.GAMESIZE.size,
            NumberBaseballEnum.RandomNumber.RANDOMNUMBERFROM.number,
            NumberBaseballEnum.RandomNumber.RANDOMNUMBERUNTIL.number
        )
        while (true) {
            val result = numberProcessor.processGameNumber(parseInputToIntList(), randomNumber)
            if (checkGameIsCompleted(result)) {
                break
            }
        }
        println("3개의 숫자를 모두 맞히셨습니다! 게임을 종료합니다.");
    }

    private fun parseInputToIntList(): MutableList<Int> {
        while (true) {
            print("${NumberBaseballEnum.RandomNumber.RANDOMNUMBERFROM.number} ~ ${NumberBaseballEnum.RandomNumber.RANDOMNUMBERUNTIL.number - 1}")
            println(" 사이의 ${NumberBaseballEnum.GameSize.GAMESIZE.size}자리 수를 입력해 주세요.")
            try {
                return readLine().toString().convertToIntList(NumberBaseballEnum.GameSize.GAMESIZE.size)
            } catch (e: Exception) {
                println(e.message)
                continue
            }
        }
    }

    private fun checkGameIsCompleted(result: ResultTransferObject): Boolean {
        if (result.strike > 0) {
            print(result.strike.toString() + "strike ")
        }
        if (result.ball > 0) {
            print(result.ball.toString() + "ball ")
        }
        if (result.strike == 0 && result.ball == 0) {
            print("nothing")
        }
        println()

        return result.strike == 3
    }
}