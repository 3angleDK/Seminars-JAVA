package Lessson_1.task;

//Записать в файл следующие данные:
//
//        Name Surname Age
//        Kate Smith 20
//        Paul Green 25
//        Mike Black 23

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;

public class Task7 {
    public static void WriteFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(String.format("%s %s %s\n", "Name", "Surname", "Age"));
        writer.write(String.format("%s %s %d\n", "Kate", "Smith", 20));
        writer.write(String.format("%s %s %d\n", "Paul", "Green", 25));
        writer.write(String.format("%s %s %d\n", "Mike", "Black", 23));
        writer.flush();
        writer.close();

    }
}
