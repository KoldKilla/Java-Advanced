import java.util.ArrayList;
import java.util.List;

/**
 * Класс для поиска самого длинного слова в массиве строк.
 */
public class FindMaxString {

    /**
     * Находит самое длинное слово в переданном массиве строк.
     *
     * @param words массив строк, в котором необходимо найти самое длинное слово
     * @return строка с результатом, содержащая самое длинное слово
     *         или сообщение о нескольких словах с одинаковой максимальной длиной.
     */
    public String findLongestWord(String[] words) {
        List<String> longestWords = new ArrayList<>();  // Список для хранения слов с максимальной длиной
        int maxLength = 0;  // Переменная для хранения максимальной длины слова

        for (String word : words) {
            int wordLength = word.length();
            if (wordLength > maxLength) {
                // Если текущее слово длиннее всех предыдущих, обновляем максимальную длину
                // и очищаем список для хранения нового слова
                maxLength = wordLength;
                longestWords.clear();
                longestWords.add(word);
            } else if (wordLength == maxLength) {
                // Если слово той же длины, что и максимальная, добавляем его в список
                longestWords.add(word);
            }
        }

        // Проверяем, есть ли несколько слов с одинаковой максимальной длиной
        if (longestWords.size() > 1) {
            return "Несколько слов с одинаковой максимальной длиной: " + longestWords;
        } else {
            return "Самое длинное слово: " + longestWords.get(0);
        }
    }
}
