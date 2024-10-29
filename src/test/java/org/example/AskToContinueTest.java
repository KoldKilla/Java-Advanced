package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class AskToContinueTest {

    @Test
    void testAskToContinueYes() {
        Scanner scanner = new Scanner("Y");
        assertTrue(AskToContinue.askToContinue(scanner), "Должно возвращать true для ввода 'Y'");
    }

    @Test
    void testAskToContinueNo() {
        Scanner scanner = new Scanner("N");
        assertFalse(AskToContinue.askToContinue(scanner), "Должно возвращать false для ввода 'N'");
    }

    @Test
    void testAskToContinueInvalidInputThenYes() {
        Scanner scanner = new Scanner("X\nY"); // Неверный ввод, затем 'Y'
        assertTrue(AskToContinue.askToContinue(scanner), "Должно возвращать true после неправильного ввода и ввода 'Y'");
    }

    @Test
    void testAskToContinueInvalidInputThenNo() {
        Scanner scanner = new Scanner("X\nN"); // Неверный ввод, затем 'N'
        assertFalse(AskToContinue.askToContinue(scanner), "Должно возвращать false после неправильного ввода и ввода 'N'");
    }
}

