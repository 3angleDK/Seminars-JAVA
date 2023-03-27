package Lessson_1.task;

import java.time.LocalTime;
import java.util.Scanner;

public class Task2 {
    public static void hello() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.next();
        System.out.println("Hello " + name);
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(5, 0)) &&
                now.isBefore(LocalTime.of(11, 0))){
            System.out.println("Доброе утро, " + name);
        } else if (now.isAfter(LocalTime.of(12, 0)) &&
                now.isBefore(LocalTime.of(18, 00))) {
            System.out.println("Добрый день, " + name);
        } else if (now.isAfter(LocalTime.of(18, 0)) &&
                now.isBefore(LocalTime.of(23, 00))) {
            System.out.println("Добрый вечер, " + name);
        } else {
            System.out.println("Доброй ночи, " + name);
        }
    }
}
