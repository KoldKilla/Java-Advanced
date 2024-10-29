package org.example;

/**
 * Данный класс предназначен для произведения математических операций.
 *
 */
public class Calculate {
    private double firstNumber;
    private double secondNumber;

    /**
     * Устанавливает первое число для вычислений.
     *
     * @param firstNumber значение первого числа
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * Устанавливает первое число для вычислений.
     *
     * @param secondNumber значение первого числа
     */
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * Выполняет арифметическую операцию над двумя числами.
     *
     * @param operation код операции:
     *                  1 - сложение,
     *                  2 - вычитание,
     *                  3 - умножение,
     *                  4 - деление.
     * @return результат выполнения операции.
     * @throws IllegalArgumentException если код операции некорректен.
     * @throws ArithmeticException если происходит попытка деления на ноль.
     */
    public double calculate(int operation) throws IllegalArgumentException, ArithmeticException {
        double result;
        switch (operation) {
            case 1: // Сложение
                result = firstNumber + secondNumber;
                break;
            case 2: // Вычитание
                result = firstNumber - secondNumber;
                break;
            case 3: // Умножение
                result = firstNumber * secondNumber;
                break;
            case 4: // Деление
                if (secondNumber == 0) {
                    throw new ArithmeticException("Ошибка: деление на ноль");
                }
                result = firstNumber / secondNumber;
                break;
            default:
                throw new IllegalArgumentException("Ошибка: некорректная операция");
        }
        return result;
    }
}