import tasks.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 0
        Task0.runCompare();
        // Task 1
        Task1.sortRandomArray();
        // Task 2
        Task2.getCopiesCount();
        Task2.removeCopies();
        // Task 3
        Task3.getOnlyStrings();
        // Home task 1
        int[] array = {9,8,7,6,19,5,4,3,2,1,0};
        System.out.printf("Исходный массив: %s\n", Arrays.toString(array));
        array = HomeTask1.mergeSort(array);
        System.out.printf("Отсортированный массив: %s\n", Arrays.toString(array));
        // Home task 2
        ArrayList<Integer> array2 = HomeTask2.getListInteger(20);
        System.out.printf("Исходный массив: %s\n", array2.toString());
        array2 = HomeTask2.removeEvenElements(array2);
        System.out.printf("Массив без четных элементов: %s\n", array2.toString());
        // Home task 3
        ArrayList<Integer> array3 = HomeTask2.getListInteger(20);
        System.out.printf("Исходный массив: %s\n", array3.toString());
        System.out.printf("Минимальное значение: %d\n", HomeTask3.getMin(array3));
        System.out.printf("Максимальное значение: %d\n", HomeTask3.getMax(array3));
        System.out.printf("Среднее значение: %f\n", HomeTask3.getMean(array3));
        // Home task 4
        ArrayList<Integer> array4 = HomeTask2.getListInteger(10);
        ArrayList<Integer> array5 = HomeTask2.getListInteger(10);
        System.out.printf("1й исходный массив: %s\n", array4.toString());
        System.out.printf("2й исходный массив: %s\n", array5.toString());
        System.out.printf("Разность массивов: %s\n", HomeTask4.getSubtraction(array4, array5).toString());
        System.out.printf("Симметрическая разность массивов: %s\n", HomeTask4.getSymmetricSubtraction(array4, array5).toString());
    }
}