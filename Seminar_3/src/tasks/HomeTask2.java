package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class HomeTask2 {

    private static Random random = new Random();
    public static ArrayList<Integer> getListInteger(int n){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            result.add(random.nextInt(-10, 10));
        }
        return result;
    }

    public static ArrayList<Integer> removeEvenElements(ArrayList<Integer> array){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer item:array) {
            if (item % 2 != 0){
                result.add(item);
            }
        }
        return result;
    }
}
