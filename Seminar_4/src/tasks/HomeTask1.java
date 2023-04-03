package tasks;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class HomeTask1 {

    public static void revers(LinkedList<Object> lst){
        for (int i = 0; i < lst.size() / 2; i++) {
            Object tmp = lst.get(i);
            lst.set(i, lst.get(lst.size() - i - 1));
            lst.set(lst.size() - i - 1, tmp);
        }
    }
}
