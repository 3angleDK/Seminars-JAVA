package tasks;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

import java.util.ArrayList;

public class HomeTask3 {
    public static int getMin(ArrayList<Integer> array){
        int result = array.get(0);
        for (int item:array) {
            if (item < result){
                result = item;
            }
        }
        return result;
    }

    public static int getMax(ArrayList<Integer> array){
        int result = array.get(0);
        for (int item:array) {
            if (item > result){
                result = item;
            }
        }
        return result;
    }

    public static double getMean(ArrayList<Integer> array){
        double result = 0.0;
        for (int item:array) {
            result += item;
        }
        return result / array.size();
    }

}
