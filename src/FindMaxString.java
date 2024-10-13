import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс для выполнения команды поиска самого длинного слова из массива строк.
 */
public class FindMaxString {
    /**
     * Выполняет команду поиска самого длинного слова.
     * Запрашивает у пользователя размер массива и сами слова,
     * после чего находит и выводит самое длинное слово.
     */
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        List<String> words = new ArrayList<>();
        System.out.println("Введите слова:");

        for (int i = 0; i < size; i++) {
            words.add(scanner.nextLine());
        }

        String longestWord = findLongestWord(words);
        System.out.println("Самое длинное слово: " + longestWord);
    }

    /**
     * Находит самое длинное слово в списке строк.
     *
     * @param words Список строк, в котором нужно найти самое длинное слово.
     * @return Самое длинное слово из списка. Если список пустой, возвращает пустую строку.
     */
    private String findLongestWord(List<String> words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
