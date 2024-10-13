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
        System.out.println("Введите два числа: ");

        Scanner scanner = new Scanner(System.in);

        Calculate calculate = new Calculate();

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Введите значение: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");

        int choose = scanner.nextInt();

        calculate.calculate(choose, firstNumber, secondNumber);
    }
}