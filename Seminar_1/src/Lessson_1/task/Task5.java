package Lessson_1.task;

//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

import java.util.Arrays;

public class Task5 {
    public static String ReorderWords(String str){
        String[] res = str.split(" ");
        for (int i = 0; i < res.length / 2; i++){
            String tmp = res[i];
            res[i] = res[res.length - 1 - i];
            res[res.length - 1 - i] = tmp;
        }
        return String.join(" ", res);
    }
}
