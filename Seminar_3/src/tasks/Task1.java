package tasks;

//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.


import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void sortRandomArray(){
        Random random = new Random();
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = random.nextInt(-10, 10);
        }
        System.out.printf("Исходный массив: %s\n", Arrays.toString(array));
        Arrays.sort(array);
        System.out.printf("Отсортированный массив: %s\n", Arrays.toString(array));
    }
}
