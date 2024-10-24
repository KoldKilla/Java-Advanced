import java.util.Scanner;

public class AskToContinue {
    /**
     * Запрашивает у пользователя, хочет ли он продолжить выполнение программы.
     * @param scanner объект Scanner для ввода пользователя
     * @return true, если пользователь ввел 'Y' (продолжить), иначе false (завершить).
     */
    static boolean askToContinue(Scanner scanner) {
        while (true) {
            System.out.println("Вы хотите продолжить? (Y/N)");
            String inputChoice = scanner.next();
            if (inputChoice.equalsIgnoreCase("Y")) {
                return true;
            } else if (inputChoice.equalsIgnoreCase("N")) {
                System.out.println("Завершение программы.");
                return false;
            } else {
                System.out.println("Ошибка: некорректный ввод. Пожалуйста, введите 'Y' для продолжения или 'N' для завершения.");
            }
        }
    }
}
