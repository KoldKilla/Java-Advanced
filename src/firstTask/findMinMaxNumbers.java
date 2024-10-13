package firstTask;

import java.util.Arrays;
import java.util.Random;

public class findMinMaxNumbers {
    public static void changeMinMaxNumbers(){
        int[] arr = new int[20];

        // Заполнение массива случайными числами
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(21) - 10;
        }

        System.out.println("Сформированный из случайных чисел массив:\n" + Arrays.toString(arr));

        // Поиск максимального отрицательного и минимального положительного элементов
        int maxNegativeNumber = -10;
        int maxNegativeNumberPosition = 0;

        int minPositiveNumber = 10;
        int minPositiveNumberPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPositiveNumber && arr[i] > 0) {
                minPositiveNumber = arr[i];
                minPositiveNumberPosition = i;
            }

            if (arr[i] > maxNegativeNumber && arr[i] < 0) {
                maxNegativeNumber = arr[i];
                maxNegativeNumberPosition = i;
            }
        }

        System.out.println(String.format("Минимальное положительное значение массива - '%s' \nМаксимальное негативное значение массива - '%s'", minPositiveNumber, maxNegativeNumber));
        System.out.println();
        System.out.println("Меняем местами минимальное и максимальное значения (1 - позиция мин. позитивного, 2 - позиция макс. негативного): " + minPositiveNumberPosition + " " + maxNegativeNumberPosition);
        arr[minPositiveNumberPosition] = maxNegativeNumber;
        arr[maxNegativeNumberPosition] = minPositiveNumber;

        // Вывод массива
        System.out.println(Arrays.toString(arr));

    }
}
