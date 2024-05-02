package numberBaseball.logic.contants

class NumberBaseballEnum {

    enum class GameSize(val size: Int) {
        GAMESIZE(3)
    }

    enum class RandomNumber(val number: Int) {
        RANDOMNUMBERFROM(0),
        RANDOMNUMBERUNTIL(10)
    }
}