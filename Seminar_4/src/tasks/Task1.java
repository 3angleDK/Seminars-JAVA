package tasks;

//Реализовать консольное приложение, которое:
//1. Принимает от пользователя строку вида text:num
//2. Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
//3. Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.


import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {

    private static List<String> list = new LinkedList<>();

    public static String inputString(String prompt){
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.next().trim();
    }

    public static boolean handleString(String str){
        String[] strs = str.split(":");
        String value = strs[0].trim();
        String indexStr = strs.length > 1 ? strs[1].trim() : "";
        switch (value.toLowerCase(Locale.ROOT)){
            case "print":
                int index = Integer.parseInt(indexStr);
                System.out.println(list.get(index));
                list.remove(index);
                break;
            case "allprint":
                System.out.println(list);
                break;
            case "quit":
                return false;
            default:
                index = Integer.parseInt(indexStr);
                if (index >= list.size()){
                    for (int i = 0; i <= index; i++){
                        list.add(null);
                    }
                }
                list.set(index, value);
        }
        return true;
    }

}
