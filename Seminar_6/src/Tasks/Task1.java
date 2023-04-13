package Tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

//1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
//        1.5. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
//        Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.


public class Task1 {
    public static Integer[] fillArray(int n){
        Random random = new Random();
        Integer[] res = new Integer[n];
        for (int i = 0; i < res.length; i++)
            res[i] = random.nextInt(25);
        return res;
    }

    public static Set<Integer> toSet(Integer[] arr){
        return Arrays.stream(arr).collect(Collectors.toSet());
    }

    public static double getUniquePercent(Integer[] arr){
        return (double) 100.0 * toSet(arr).size() / arr.length;
    }
}
