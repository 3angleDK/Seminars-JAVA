package Lessson_1;

import Lessson_1.task.*;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        task1.hello();
        // Task 2
//        Task2.hello();
        // Task 3
//        int[] arr = new int[] {1, 1, 0, 1, 1, 1};
//        System.out.printf("Максимальное количество подряд идущих 1: %d", Task3.UnityCount(arr));
        // Task 4
//        int[] arr = new int[] {3, 2, 2, 3, 1, 8, 4, 3, 0};
//        Task4.ReorderArray(arr, 3);
//        System.out.println(Arrays.toString(arr));
        // Task 5
//        System.out.println(Task5.ReorderWords("Добро пожаловать на курс по Java"));
        // Task 6
//        System.out.printf("3^2 = %f\n", Task6.power(3, 2));
//        System.out.printf("2^-2 = %f\n", Task6.power(2, -2));
//        System.out.printf("3^0 = %f\n", Task6.power(3, 0));
        // Task 7
        try {
            Task7.WriteFile("data.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}