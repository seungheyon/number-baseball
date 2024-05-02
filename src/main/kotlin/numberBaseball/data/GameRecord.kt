package numberBaseball.data

var gameHistory : MutableList<GameRecord> = ArrayList()

fun printGameRecord(){
    var gameOrder = 1
    for(record in gameHistory){
        println("$gameOrder 번째 게임 : 시도 횟수 - ${record.getGameCount()}")
        gameOrder++
    }
    println()
}

class GameRecord {
    private var gameCount : Int = 0

    fun addGameCount(){
        gameCount++
    }
    fun getGameCount() : Int {
        return gameCount
    }
}