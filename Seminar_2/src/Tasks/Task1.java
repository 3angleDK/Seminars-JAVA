package Tasks;

//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

public class Task1 {
    public static String GetRepeatingStr(String s1, String s2, int n){
        String res = s1;
        for (int i = 1; i < n; i ++){
            if (i % 2 == 0) res += s1;
            else res += s2;
        }
        return res;
    }
}
