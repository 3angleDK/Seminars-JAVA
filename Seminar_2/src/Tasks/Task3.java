package Tasks;

//Напишите метод, который принимает на вход строку (String) и определяет
//является ли строка палиндромом (возвращает boolean значение).

public class Task3 {
    public static boolean IsPalindrom(String str){
        for (int i = 0; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }
}
