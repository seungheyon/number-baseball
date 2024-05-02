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
        val inputExpected3strike = mutableListOf<Int>(1, 2, 3)
        val resultExpected3strike = ResultTransferObject(3,0)

        // Act
        var actual = sut.processGameNumber(inputExpected3strike, controlledRandomNumber)

        // Assert
        assertThat(actual.strike).isEqualTo(resultExpected3strike.strike)
        assertThat(actual.ball).isEqualTo(resultExpected3strike.ball)

        // Arrange
        val inputExpected2strike = mutableListOf<Int>(1, 2, 4)
        val resultExpected2strike = ResultTransferObject(2, 0)

        // Act
        actual = sut.processGameNumber(inputExpected2strike, controlledRandomNumber)

        // Assert
        assertThat(actual.strike).isEqualTo(resultExpected2strike.strike)
        assertThat(actual.ball).isEqualTo(resultExpected2strike.ball)

        // Arrange
        val inputExpected1strike2ball = mutableListOf<Int>(1, 3, 2)
        val resultExpected1strike2ball = ResultTransferObject(1, 2)

        // Act
        actual = sut.processGameNumber(inputExpected1strike2ball, controlledRandomNumber)

        // Assert
        assertThat(actual.strike).isEqualTo(resultExpected1strike2ball.strike)
        assertThat(actual.ball).isEqualTo(resultExpected1strike2ball.ball)

        // Arrange
        val inputExpected1strike1ball = mutableListOf<Int>(1, 3, 4)
        val resultExpected1strike1ball = ResultTransferObject(1, 1)

        // Act
        actual = sut.processGameNumber(inputExpected1strike1ball, controlledRandomNumber)

        // Assert
        assertThat(actual.strike).isEqualTo(resultExpected1strike1ball.strike)
        assertThat(actual.ball).isEqualTo(resultExpected1strike1ball.ball)

        // Arrange
        val inputExpected1strike = mutableListOf<Int>(1, 5, 4)
        val resultExpected1strike = ResultTransferObject(1, 0)

        // Act
        actual = sut.processGameNumber(inputExpected1strike, controlledRandomNumber)

        // Assert
        assertThat(actual.strike).isEqualTo(resultExpected1strike.strike)
        assertThat(actual.ball).isEqualTo(resultExpected1strike.ball)

        // Arrange
        val inputExpected3ball = mutableListOf<Int>(3, 1, 2)
        val resultExpected3ball = ResultTransferObject(0, 3)

        // Act
        actual = sut.processGameNumber(inputExpected3ball, controlledRandomNumber)

        // Assert
        assertThat(actual.strike).isEqualTo(resultExpected3ball.strike)
        assertThat(actual.ball).isEqualTo(resultExpected3ball.ball)

        // Arrange
        val inputExpected2ball = mutableListOf<Int>(4, 1, 2)
        val resultExpected2ball = ResultTransferObject(0, 2)

        // Act
        actual = sut.processGameNumber(inputExpected2ball, controlledRandomNumber)

        // Assert
        assertThat(actual.strike).isEqualTo(resultExpected2ball.strike)
        assertThat(actual.ball).isEqualTo(resultExpected2ball.ball)

        // Arrange
        val inputExpected1ball = mutableListOf<Int>(4, 5, 2)
        val resultExpected1ball = ResultTransferObject(0, 1)

        // Act
        actual = sut.processGameNumber(inputExpected1ball, controlledRandomNumber)

        // Assert
        assertThat(actual.strike).isEqualTo(resultExpected1ball.strike)
        assertThat(actual.ball).isEqualTo(resultExpected1ball.ball)

        // Arrange
        val inputExpectedNothing = mutableListOf<Int>(7, 8, 9)
        val resultExpectedNothing = ResultTransferObject(0, 0)

        // Act
        actual = sut.processGameNumber(inputExpectedNothing, controlledRandomNumber)

        // Assert
        assertThat(actual.strike).isEqualTo(resultExpectedNothing.strike)
        assertThat(actual.ball).isEqualTo(resultExpectedNothing.ball)
    }

}