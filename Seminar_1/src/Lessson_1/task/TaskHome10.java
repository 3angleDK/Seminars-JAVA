package Lessson_1.task;

import java.util.Scanner;

public class TaskHome10 {
    public static boolean IsNumberPrime(int n){
        int n_2 = (int)Math.sqrt(n);
        for (int i = 2; i <= n_2; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void PrintPrimeNumbers(int n){
        for (int i = 2; i <= n; i++){
            if (TaskHome10.IsNumberPrime(i)){
                System.out.printf("%d, ", i);
            }
        }
    }
}
