package Tasks;

//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task5 {

    public static String[] getDirContext(String dir){
        File file = new File(dir);
        return file.list();
    }

    public static void saveStrsToFile(String[] strs, String filename){

        try {
            FileWriter fw = new FileWriter(filename);
            for (String s:strs) {
                fw.write(s+"\n");
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
