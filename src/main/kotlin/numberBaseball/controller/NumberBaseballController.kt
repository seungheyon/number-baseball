package numberBaseball.controller

import numberBaseball.data.GameRecord
import numberBaseball.data.gameHistory
import numberBaseball.data.printGameRecord
import numberBaseball.logic.numberProcessor.NumberProcessor
import numberBaseball.logic.contants.NumberBaseballEnum
import numberBaseball.logic.gamePlayManagement.GamePlayManager
import numberBaseball.logic.numberProcessor.ResultTransferObject
import numberBaseball.logic.util.RandomNumberGenerator
import numberBaseball.logic.util.convertToIntList
import numberBaseball.logic.util.validateMenuSelectionInput

class NumberBaseballController() {
    fun go() {
        print("환영합니다!")
        while (true) {
            println("원하시는 번호를 입력해 주세요.")
            println("1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기")

            val gamePlayManager = GamePlayManager(
                numberProcessor = NumberProcessor(gameRecord = GameRecord()),
                randomNumberGenerator = RandomNumberGenerator()
            )

            val menu = readLine().toString()
            if (!menu.validateMenuSelectionInput()) {
                continue
            }
            when (menu) {
                "1" -> gamePlayManager.gameStart()
                "2" -> printGameRecord()
                "3" -> return
            }
        }
    }
}
