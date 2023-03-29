package Tasks;

//Напишите метод, который сжимает строку.
//        Пример: aaaabbbcdd → a4b3cd2

public class Task2 {
    private static String AppendChar(char c, int m){
        if (m == 1) return Character.toString(c);
        else return c + Integer.toString(m);
    }

    public static String PackStr(String src){
        String dst = "";
        int count = 1;
        for (int i = 1; i < src.length(); i++){
            if (src.charAt(i-1) == src.charAt(i)){
                count ++;
            }
            else {
                dst += AppendChar(src.charAt(i-1), count);
                count = 1;
            }
        }
        dst += AppendChar(src.charAt(src.length()-1), count);
        return dst;
    }
}
