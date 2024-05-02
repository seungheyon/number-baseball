package numberBaseball.logic.numberProcessor

class NumberProcessor() {

    fun processGameNumber(intList: MutableList<Int>, randomNumbers: List<Int>): ResultTransferObject {
        var strike: Int = 0
        var ball: Int = 0
        for (i in 0 until 3) {
            if (randomNumbers[i] == intList[i]) {
                strike++
                continue
            }
            if (randomNumbers.contains(intList[i])) {
                ball++
            }
        }
        return ResultTransferObject(strike, ball)

    }
}