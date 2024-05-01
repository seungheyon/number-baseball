import numberBaseball.controller.NumberBaseballController
import numberBaseball.logic.NumberProcessor
import numberBaseball.logic.util.RandomNumberGenerator

fun main(args: Array<String>) {
    //println("Hello World!")
    val numberBaseballController = NumberBaseballController(
        numberProcessor = NumberProcessor(),
        randomNumberGenerator = RandomNumberGenerator()
    )
    numberBaseballController.start()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
}