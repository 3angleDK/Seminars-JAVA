package tasks;

//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    private static boolean isNumber(String str){
        try{
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
    public static void getOnlyStrings(){
        String str = "В 1 массиве 6 строк должны 7 456 12 быть 9 только строки";
        List<String> lst = new ArrayList<>();
        Collections.addAll(lst, str.split(" "));
        System.out.printf("Исходный список: %s\n", lst.toString());
        int i = 0;
        while (i < lst.size()){
            if (isNumber(lst.get(i))) {
                lst.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.printf("Список без чисел: %s\n", lst.toString());
    }
}
