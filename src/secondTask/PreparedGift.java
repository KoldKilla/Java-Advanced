package secondTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PreparedGift {
    public static void preparedGift() throws IOException {
        ArrayList<Sweets> sweets = new ArrayList<>();
        boolean formed = false;
        int totalPrice = 0;
        int totalWeight = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Нажмите соответствующую цифру, чтобы добавить сладость в подарок:");
        System.out.println("'1' - Печенье \"Oreo\"");
        System.out.println("'2' - Мармелад \"Чупа-чупс Фэнсы\"");
        System.out.println("'3' - Шоколад \"Ritter Sport\"");
        System.out.println("'4' - Закончить выбор");

        while (!formed) {
            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    Cookies cookies = new Cookies("Печенье \"Oreo\"", 200, 1000, "123");
                    sweets.add(cookies);
                    totalPrice += cookies.getPrice();
                    totalWeight += cookies.getWeight();
                    System.out.println("Печенье \"Oreo\" добавлено в подарок");
                    break;
                case "2":
                    Jellybean jellybean = new Jellybean("Мармелад \"Чупа-чупс Фэнсы\"", 119, 150, "Кислый вкус");
                    sweets.add(jellybean);
                    totalPrice += jellybean.getPrice();
                    totalWeight += jellybean.getWeight();
                    System.out.println("Мармелад \"Чупа-чупс Фэнсы\" добавлен в подарок");
                    break;
                case "3":
                    Chocolate chocolate = new Chocolate("Шоколад \"Ritter Sport\"", 59, 50, "Германия");
                    sweets.add(chocolate);
                    totalPrice += chocolate.getPrice();
                    totalWeight += chocolate.getWeight();
                    System.out.println("Шоколад \"Ritter Sport\" добавлен в подарок");
                    break;
                case "4":
                    formed = true;
                    break;
            }


        }

        int count = 0;
        System.out.println("\nПодарок состоит из:");
        for (Sweets sweet : sweets) {
            count++;
            if (sweet instanceof Cookies) {
                Cookies cookie = (Cookies) sweet;
                System.out.println(count + ". " + cookie.getName() + " - Калорийность: " + cookie.getCalories());
            } else if (sweet instanceof Jellybean) {
                Jellybean Jellybean = (Jellybean) sweet;
                System.out.println(count + ". " + Jellybean.getName() + " - Вкус: " + Jellybean.getTaste());
            } else if (sweet instanceof Chocolate) {
                Chocolate Chocolate = (Chocolate) sweet;
                System.out.println(count + ". " + Chocolate.getName() + " - Страна производства: " + Chocolate.getCountry());
            }
        }
        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalWeight, totalPrice));
    }
}
