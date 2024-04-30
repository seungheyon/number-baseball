package numberBaseball.controller

import numberBaseball.logic.NumberProcessor
import numberBaseball.logic.util.stringToIntArray

class NumberBaseballController(
    private val numberProcessor: NumberProcessor
) {
    fun start(){
        parseInputToIntArray()
    }

    private fun parseInputToIntArray() : MutableList<Int> {
        while(true){
            try{
                return stringToIntArray(readLine().toString(), 3)
            } catch (e : Exception){
                continue
            }
        }
    }
}