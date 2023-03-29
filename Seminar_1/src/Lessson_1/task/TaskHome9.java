package Lessson_1.task;

import java.util.Scanner;

public class TaskHome9 {
    public static void GetFactorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = Integer.parseInt(scanner.nextLine());
        int res = 1;
        for (int i = 2; i <= n; i ++) res *= i;
        System.out.printf("Факториал числа %d = %d.\n", n, res);
//        scanner.close();
    }
}
