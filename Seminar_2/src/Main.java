import Tasks.*;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws ParseException {
        // Task 1
        System.out.println(Task1.GetRepeatingStr("a","b", 19));
        // Task 2
        System.out.println(Task2.PackStr("aaaabbbcdd"));
        // Task 3
        System.out.println(Task3.IsPalindrom("aaaabcbaaaa"));
        // Task 4
        String str = Task4.getRepeatStr("TEST", 100);
        Task4.writeStrToFile(str, "test.txt");
        // Task 5
        String[] files = Task5.getDirContext(new File("").getAbsolutePath());
        Task5.saveStrsToFile(files, "files.txt");
        // Home task 1
        int[] arr = new int[] {9,8,7,6,5,4,3,2,1,0};
        HomeTask1.bubleSort(arr);
        System.out.println(Arrays.toString(arr));
        // Home task 2
        String jsonStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                          "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                          "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        Vector<Person> vec =  Person.parseString(jsonStr);
        for (Person p: vec) {
            System.out.println(p.toString());
        }

    }
}