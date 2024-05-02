package logic.numberProcessor

import numberBaseball.logic.numberProcessor.NumberProcessor
import numberBaseball.logic.numberProcessor.ResultTransferObject
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

import org.assertj.core.api.Assertions.assertThat

class NumberProcessorTest {

    @DisplayName("sut는 정답 정수 배열과 입력된 정수 배열을 비교하여 스트라이크와 볼의 개수를 판별한다.")
    @Test
    fun numberProcessorTest(){
        // Arrange
        val sut = NumberProcessor()
        val controlledRandomNumber = mutableListOf<Int>(1, 2, 3)
        val input = mutableListOf<Int>(1, 2, 3)
        val expectedResult = ResultTransferObject(3,0)

        // Act
        val actual = sut.processGameNumber(input, controlledRandomNumber)

        // Assert
        assertThat(actual.strike).isEqualTo(expectedResult.strike)
        assertThat(actual.ball).isEqualTo(expectedResult.ball)

    }




}