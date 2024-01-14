package com.cubix.cleancode;

import com.cubix.cleancode.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorUnitTest {

    @Autowired
    private Calculator calculator;

    @Nested
    class Addition {
        @Test
        @DisplayName("Given I have 2 numbers, When I add them together, Then it should return " +
                "the sum of the two numbers.")
        void addTwoPositiveNumbersReturnSum() {
            // Arrange
            int a = 1;
            int b = 2;
            double expected = 3D;
            // Act
            Double actual = calculator.add((double) a, (double) b);
            // Assert
            Assertions.assertEquals(actual, expected);
        }

        @Test
        @DisplayName("Given I have 2 numbers one of it negative, When I add them together, " +
                "Then it should return the sum of the two numbers.")
        void addTwoNegativeNumbersReturnSum() {
            // Arrange
            int a = -3;
            int b = 1;
            double expected = -2D;
            // Act
            Double actual = calculator.add((double) a, (double) b);
            // Assert
            Assertions.assertEquals(actual, expected);
        }

        @Test
        @DisplayName("Given I have 2 numbers one of it zero, When I add them together, " +
                "Then it should return the sum of the two numbers.")
        void addTwoNumbersOneOfItZeroReturnSum() {
            // Arrange
            int a = 0;
            int b = 4;
            Double expected = 4D;
            // Act
            Double actual = calculator.add((double) a, (double) b);
            // Assert
            Assertions.assertEquals(actual, expected);
        }

        @Test
        @DisplayName("Given I have 2 floating point numbers, When I add them together, " +
                "Then it should return the sum of the two numbers.")
        void addTwoFloatingPointNumbersReturnSum() {
            // Arrange
            Double a = 2.2D;
            Double b = 4.1D;
            Double expected = 6.3D;
            // Act
            Double actual = calculator.add(a, b);
            // Assert
            Assertions.assertEquals(actual, expected);
        }

        @Test
        @DisplayName("Given I have 2 floating point numbers, When I add them together, " +
                "Then it should return the sum of the two numbers.")
        void addTwoNumbersTestCommutativityReturnSameSum() {
            // Arrange
            Double a = 6D;
            Double b = 4D;
            Double expected = 10D;
            // Act
            Double actual = calculator.add(a, b);
            Double commutativeActual = calculator.add(a, b);
            // Assert
            Assertions.assertEquals(actual, commutativeActual);
            Assertions.assertEquals(actual, expected);
            Assertions.assertEquals(commutativeActual, expected);
        }
    }

}
