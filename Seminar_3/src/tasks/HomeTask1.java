package tasks;

import java.util.Arrays;

//Реализовать алгоритм сортировки слиянием
public class HomeTask1 {

    private static int[] copyArray(int[] arr, int indexL, int indexR){
        int[] result = new int[indexR - indexL];
        for (int i = 0; i < result.length; i++){
            result[i] = arr[indexL + i];
        }
        return result;
    }

    public static int[] mergeSort(int[] arr){
        if (arr.length <= 1) return arr;
        int[] result = new int[arr.length];
        int middle = arr.length / 2;
        int[] leftArr = mergeSort(copyArray(arr, 0, middle));
        int[] rightArr = mergeSort(copyArray(arr, middle, arr.length));
        int iLeft = 0, iRight = 0, i = 0;
        while (iLeft < leftArr.length && iRight < rightArr.length){
            result[i++] = (leftArr[iLeft] <= rightArr[iRight]) ? leftArr[iLeft++] : rightArr[iRight++];
        }
        while (iLeft < leftArr.length){
            result[i++] = leftArr[iLeft++];
        }
        while (iRight < rightArr.length){
            result[i++] = rightArr[iRight++];
        }
        return result;
    }
}
