package Tasks;

import java.io.FileWriter;
import java.io.IOException;

//Напишите метод, который составит строку, состоящую из 100 повторений
// слова TEST и метод, который запишет эту строку в простой текстовый файл,
// обработайте исключения.

public class Task4 {
    public static String getRepeatStr(String str, int n){
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < n; i++){
            res.append(str);
        }
        return res.toString();
        //return str.repeat(n);
    }

    public static void writeStrToFile(String str, String filename){
        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(str);
            fw.close();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
