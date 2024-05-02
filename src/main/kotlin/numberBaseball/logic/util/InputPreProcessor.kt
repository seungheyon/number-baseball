package numberBaseball.logic.util

fun String.convertToIntList(gameSize: Int): MutableList<Int> {
    val inputNumber: MutableList<Int> = ArrayList()
    for (i in 0 until gameSize) {
        if (this.length != gameSize) {
            throw IllegalArgumentException("Please enter a $gameSize - digit number")
        }
        try {
            var number = this.substring(i, i + 1).toInt()
            require(!inputNumber.contains(number))
            inputNumber.add(number)
        } catch (e: Exception) {
            throw IllegalArgumentException("Please enter a valid numeric order.")
        }
    }
    return inputNumber
}


