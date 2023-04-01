package tasks;

import java.util.ArrayList;

import static java.lang.Math.min;

//Реализовать разность массивов и симметрическую разность.
public class HomeTask4 {

    public static ArrayList<Integer> getSubtraction(ArrayList<Integer> array1,
                                                    ArrayList<Integer> array2){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < min(array1.size(), array2.size()); i++) {
            result.add(array1.get(i) - array2.get(i));
        }
        return result;
    }

    public static ArrayList<Integer> getSymmetricSubtraction(ArrayList<Integer> array1,
                                                             ArrayList<Integer> array2){
        ArrayList<Integer> result = new ArrayList<>();
        for (int item:array1) {
            if (!array2.contains(item)){
                result.add(item);
            }
        }
        for (int item:array2) {
            if (!array1.contains(item)){
                result.add(item);
            }
        }
        return result;
    }
}
