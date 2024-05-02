package numberBaseball.logic.util

fun String.validateMenuSelectionInput(): Boolean {
    try {
        if (this.toInt() in 1..3) {
            return true
        }
        println("메뉴 번호와 일치하는 숫자를 입력해 주세요.")
        return false

    } catch (e: NumberFormatException) {
        println("메뉴 번호와 일치하는 숫자를 입력해 주세요.")
        return false
    }
}