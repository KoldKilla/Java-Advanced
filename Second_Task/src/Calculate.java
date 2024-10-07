import java.util.Scanner;

/**
 * Данный класс предназначен для произведения математических операций.
 * @author Демидов К. С.
 * @version 1.0
 * */
public class Calculate {

    /**
     * Метод производит сложение двух чисел.
     *
     * @param x - первое число
     * @param y - второе число
     * @return result - итог математической операции
     */
    public static String add(double x, double y)
    {
        double value = x + y;
        String result = String.format("%.4f", value);
        return result;
    }

    /**
     * Метод производит вычитание двух чисел.
     *
     * @param x - первое число
     * @param y - второе число
     * @return result - итог математической операции
     */
    public static String sub(double x, double y)
    {
        double value = x - y;
        String result = String.format("%.4f", value);
        return result;
    }

    /**
     * Метод производит умножение двух чисел.
     *
     * @param x - первое число
     * @param y - второе число
     * @return result - итог математической операции
     */
    public static String mult(double x, double y)
    {
        double value = x * y;
        String result = String.format("%.4f", value);
        return result;
    }

    /**
     * Метод производит деление двух чисел.
     *
     * @param x - первое число
     * @param y - второе число
     * @return result - итог математической операции
     */
    public static String div(double x, double y)
    {
        double value = x / y;
        String result = String.format("%.4f", value);
        return result;
    }

    /**
     * Метод производит деление двух чисел.
     *
     * @param chooseMathsAction - тип математической операции
     * @param x - первое число
     * @param y - второе число
     */
    public void calculate(int chooseMathsAction, double x, double y) {
        switch (chooseMathsAction){
            case 1:
                System.out.println(add(x, y));
                break;
            case 2:
                System.out.println(sub(x, y));
                break;
            case 3:
                System.out.println(mult(x, y));
                break;
            case 4:
                System.out.println(div(x, y));
                break;
            default:
                System.out.println("Неправильная операция");
        }
    }

     /**
     * Метод производит поиск самого длинного слова
     *
     */
    public void findMaxString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        String[] words = new String[size];
        System.out.println("Введите слова:");

        for (int i = 0; i < size; i++) {
            words[i] = scanner.nextLine();
        }

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Самое длинное слово: " + longestWord);
    }
}
