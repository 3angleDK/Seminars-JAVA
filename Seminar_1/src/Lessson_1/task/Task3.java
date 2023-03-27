package Lessson_1.task;

//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public class Task3 {
    public static int UnityCount(int[] arr){
        int count = 0, curCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1) {
                curCount++;
                if (curCount > count) count = curCount;
            }
            else
                curCount = 0;
        }
        return count;
    }
}
