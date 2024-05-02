package numberBaseball.logic.util

fun String.convertToIntList(gameSize: Int): MutableList<Int> {
    val inputNumber: MutableList<Int> = ArrayList()
    for (i in 0 until gameSize) {
        try {
            val number = this.substring(i, i + 1).toInt()
            require(!inputNumber.contains(number))
            inputNumber.add(number)
        } catch (e: Exception) {
            throw IllegalArgumentException("올바른 수를 입력해 주세요.")
        }
        if (this.length != gameSize) {
            throw IllegalArgumentException("서로 다른 $gameSize 자리의 수를 입력해 주세요.")
        }
    }
    return inputNumber
}


