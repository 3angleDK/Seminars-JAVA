package tasks;

import java.util.*;

//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.

public class Task2 {
    private static ArrayDeque<String> queque = new ArrayDeque<>();

    public static boolean handleString(String str){
        switch (str.toLowerCase(Locale.ROOT)){
            case "print":
                System.out.println(queque);
                break;
            case "revert":
                queque.pop();
                break;
            case "quit":
                return false;
            default:
                queque.push(str);
        }
        return true;
    }
}
