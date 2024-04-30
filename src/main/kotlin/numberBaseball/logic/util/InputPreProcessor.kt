package numberBaseball.logic.util

fun stringToIntArray(inputString:String, gameSize: Int): MutableList<Int> {
    val inputNumber: MutableList<Int> = ArrayList()
    for(i in 0 until gameSize){
        try{
            var number = inputString.substring(i, i + 1).toInt()
            require(!inputNumber.contains(number))
            inputNumber.add(number)
        } catch (e : IllegalArgumentException){
            println("Please enter a valid numeric order.")
        } catch (e : NumberFormatException){
            println("Please enter numbers not duplicated.")
        }
    }
    return inputNumber
}

