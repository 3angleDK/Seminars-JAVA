package Lessson_1.task;

import java.io.IOException;
import java.util.Scanner;

public class TaskHome8 {
//    Вычислить n-ое треугольного число(сумма чисел от 1 до n),
public static void GetTriangleNumber(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n = scanner.nextInt();
    int res = 0;
    for (int i = 1; i <= n; i ++) res += i;
    System.out.printf("%d-ое треугольное число = %d.\n", n, res);
//    scanner.close();
}
}
