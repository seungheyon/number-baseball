package numberBaseball.logic

class NumberProcessor() {

    fun processGameNumber(intList : MutableList<Int>, randomNumbers : List<Int>) : Boolean{
        var strike : Int = 0
        var ball : Int = 0
        for(i in 0 until 3){
            if(randomNumbers[i] == intList[i]){
                strike++
                continue
            }
            if(randomNumbers.contains(intList[i])){
                ball++
            }
        }

        if (strike > 0) {
            print(strike.toString() + "strike ")
        }
        if (ball > 0) {
            print(ball.toString() + "ball ")
        }
        if (strike == 0 && ball == 0) {
            print("nothing")
        }
        println()

        return strike != 3
    }
}