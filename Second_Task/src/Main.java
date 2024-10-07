/**
 * Данный класс является точкой входа в программу.
 *  * Он получает ввод от пользователя и вызывает методы для выполнения математических операций.
 *
 * @author Демидов К. С.
 * @version 1.0
 * */

import java.util.Scanner;

/**
 * Точка входа в программу.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие программы. 1 - Калькулятор, 2 - Поиск самого длинного слова.");

        int actionProgram = scanner.nextInt();

        if (actionProgram == 1) {
            System.out.println("Введите два числа: ");
            double firstNumber = scanner.nextDouble();
            double secondNumber = scanner.nextDouble();

            System.out.println("Введите значение: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
            int mathsAction = scanner.nextInt();

            Calculate calculate = new Calculate();
            calculate.calculate(mathsAction, firstNumber, secondNumber);
        } else if (actionProgram == 2) {
            Calculate calculate = new Calculate();
            calculate.findMaxString();
        } else {
            System.out.println("Вы выбрали некорректное значение, попробуйте заново");
        }

        scanner.close();
    }
}