package Lessson_1.task;

//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public class Task4 {
    public static void ReorderArray(int[] arr, int val){
        int lastEl = arr.length - 1;
        int i = 0;
        while (i < lastEl){
            if (arr[i] == val){
                arr[i] = arr[lastEl];
                arr[lastEl] = val;
                lastEl--;
            }
            else i++;
        }
    }
}
