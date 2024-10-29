package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    private Calculate calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculate();
    }

    @Test
    void testAddition() {
        calculator.setFirstNumber(5);
        calculator.setSecondNumber(3);
        assertEquals(8, calculator.calculate(1), "Сложение 5 + 3 должно быть равно 8");
    }

    @Test
    void testSubtraction() {
        calculator.setFirstNumber(5);
        calculator.setSecondNumber(3);
        assertEquals(2, calculator.calculate(2), "Вычитание 5 - 3 должно быть равно 2");
    }

    @Test
    void testMultiplication() {
        calculator.setFirstNumber(5);
        calculator.setSecondNumber(3);
        assertEquals(15, calculator.calculate(3), "Умножение 5 * 3 должно быть равно 15");
    }

    @Test
    void testDivision() {
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(3);
        assertEquals(2, calculator.calculate(4), "Деление 6 / 3 должно быть равно 2");
    }

    @Test
    void testDivisionByZero() {
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(0);
        assertThrows(ArithmeticException.class, () -> calculator.calculate(4), "Деление на ноль должно вызывать ArithmeticException");
    }

    @Test
    void testInvalidOperationCode() {
        calculator.setFirstNumber(6);
        calculator.setSecondNumber(3);
        assertThrows(IllegalArgumentException.class, () -> calculator.calculate(5), "Некорректный код операции должен вызывать IllegalArgumentException");
    }
}

