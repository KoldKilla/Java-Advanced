/**
 * Данный класс является точкой входа в программу.
 *  * Он получает ввод от пользователя и вызывает методы для выполнения математических операций.
 *
 * @author Демидов К. С.
 * @version 1.0
 */

import java.util.Scanner;

/**
 * Точка входа в программу.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculate calculate = new Calculate();

        System.out.println("Выберите действие программы. 1 - Калькулятор, 2 - Поиск самого длинного слова.");

        int actionProgram = scanner.nextInt();

        while (true) {
            if (actionProgram == 1) {
                System.out.println("Введите первое число: ");
                double firstNumber = scanner.nextDouble();

                System.out.println("Введите второе число: ");
                double secondNumber = scanner.nextDouble();

                System.out.println("Введите действие: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
                int mathsAction = scanner.nextInt();

                Context context = new Context(firstNumber, secondNumber);
                System.out.println(calculate.calculate(mathsAction, context));

                System.out.println("Вы хотите продолжить? (Y/N)");
                String inputChoice = scanner.next();
                if (inputChoice.equalsIgnoreCase("N")) break;

            } else if (actionProgram == 2) {
                FindMaxString findMaxString = new FindMaxString();
                findMaxString.execute();

                System.out.println("Вы хотите продолжить? (Y/N)");
                String inputChoice = scanner.next();

                if (inputChoice.equalsIgnoreCase("N")) {
                    System.out.println("Пока!");
                    break;

                } else if (!inputChoice.equalsIgnoreCase("Y")) {
                    break;
                }
            }
        }
    }
}