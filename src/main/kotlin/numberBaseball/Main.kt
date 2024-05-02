import numberBaseball.controller.NumberBaseballController
import numberBaseball.data.GameRecord
import numberBaseball.logic.gamePlayManagement.GamePlayManager
import numberBaseball.logic.numberProcessor.NumberProcessor
import numberBaseball.logic.util.RandomNumberGenerator

fun main(args: Array<String>) {

    val numberBaseballController = NumberBaseballController()
    numberBaseballController.go()

}