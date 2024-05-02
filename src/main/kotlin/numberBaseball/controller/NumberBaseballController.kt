package numberBaseball.controller

import numberBaseball.logic.numberProcessor.NumberProcessor
import numberBaseball.logic.contants.NumberBaseballEnum
import numberBaseball.logic.numberProcessor.ResultTransferObject
import numberBaseball.logic.util.RandomNumberGenerator
import numberBaseball.logic.util.convertToIntList
import numberBaseball.logic.util.validateMenuSelectionInput

class NumberBaseballController(
    private val numberProcessor: NumberProcessor,
    private val randomNumberGenerator: RandomNumberGenerator
) {
    fun go(){
        print("환영합니다!")
        while(true){
            println("원하시는 번호를 입력해 주세요.")
            println("1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기")

            val menu = readLine().toString()
            if(!menu.validateMenuSelectionInput()){
                continue
            }
            when(menu){
                "1" -> gameStart()
                //2 -> checkGameRecord()
                "3" -> return
            }
        }
    }

    private fun gameStart() {
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
            println(" 사이의 서로 다른 ${NumberBaseballEnum.GameSize.GAMESIZE.size}자리 수를 입력해 주세요.")
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