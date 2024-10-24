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
        Calculate calculator = new Calculate();  // Калькулятор для выполнения операций
        FindMaxString findMaxString = new FindMaxString(); // Объект для поиска самого длинного слова

        while (true) {
            System.out.println("Выберите действие программы: 1 - Калькулятор, 2 - Поиск самого длинного слова");
            int actionProgram = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            if (actionProgram == 1) {
                try {
                    // Ввод чисел для калькуляции
                    System.out.println("Введите первое число: ");
                    double firstNumber = scanner.nextDouble();
                    calculator.setFirstNumber(firstNumber);

                    System.out.println("Введите второе число: ");
                    double secondNumber = scanner.nextDouble();
                    calculator.setSecondNumber(secondNumber);

                    System.out.println("Введите действие: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
                    int mathsAction = scanner.nextInt();

                    // Получение и вывод результата
                    double result = calculator.calculate(mathsAction);
                    System.out.printf("Результат: %.4f%n", result);

                } catch (IllegalArgumentException | ArithmeticException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                // Продолжить или завершить
                System.out.println("Вы хотите продолжить? (Y/N)");
                String inputChoice = scanner.next();
                if (inputChoice.equalsIgnoreCase("N")) break;

            } else if (actionProgram == 2) {
                // Ввод размера массива
                System.out.print("Введите количество слов: ");
                int size = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера после ввода числа

                // Создаем массив слов
                String[] words = new String[size];

                // Ввод слов
                System.out.println("Введите слова:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Слово " + (i + 1) + ": ");
                    words[i] = scanner.nextLine();
                }

                // Поиск самого длинного слова
                String longestWord = findMaxString.findLongestWord(words);
                System.out.println("Самое длинное слово: " + longestWord);

                // Продолжить или завершить
                System.out.println("Вы хотите продолжить? (Y/N)");
                String inputChoice = scanner.next();
                if (inputChoice.equalsIgnoreCase("N")) {
                    System.out.println("Пока!");
                    break;
                }
            } else {
                System.out.println("Ошибка: Некорректный выбор программы.");
            }
        }

        scanner.close();
    }
}
