import numberBaseball.controller.NumberBaseballController
import numberBaseball.logic.numberProcessor.NumberProcessor
import numberBaseball.logic.util.RandomNumberGenerator

fun main(args: Array<String>) {

    val numberBaseballController = NumberBaseballController(
        numberProcessor = NumberProcessor(),
        randomNumberGenerator = RandomNumberGenerator()
    )
    numberBaseballController.start()

}