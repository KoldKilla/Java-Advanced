package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMaxStringTest {

    private final FindMaxString findMaxString = new FindMaxString();

    @Test
    void testFindLongestWordSingleLongest() {
        String[] words = {"apple", "banana", "kiwi"};
        assertEquals("Самое длинное слово: banana", findMaxString.findLongestWord(words), "Слово 'banana' должно быть самым длинным");
    }

    @Test
    void testFindLongestWordMultipleLongest() {
        String[] words = {"apple", "banana", "orange"};
        assertEquals("Несколько слов с одинаковой максимальной длиной: [banana, orange]",
                findMaxString.findLongestWord(words),
                "Должны быть найдены несколько слов с одинаковой максимальной длиной");
    }

    @Test
    void testFindLongestWordEmptyArray() {
        String[] words = {};
        assertEquals("Несколько слов с одинаковой максимальной длиной: []",
                findMaxString.findLongestWord(words),
                "Пустой массив должен возвращать сообщение о пустом списке");
    }

    @Test
    void testFindLongestWordSingleWord() {
        String[] words = {"apple"};
        assertEquals("Самое длинное слово: apple", findMaxString.findLongestWord(words), "Должно вернуться единственное слово 'apple'");
    }
}

