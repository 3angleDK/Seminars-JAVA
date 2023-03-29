package Tasks;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Iterator;
import java.util.Vector;

// Дана строка json:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
public class Person {
    private String lastName;
    private String mark;
    private String subject;

    public Person(String lastName, String mark, String subject){
        this.lastName = lastName;
        this.mark = mark;
        this.subject = subject;
    }

    public static Vector<Person> parseString(String str){
        Vector<Person>  result = new Vector<Person>();
        JSONParser parser = new JSONParser();
        Object obj;
        try {
            obj = parser.parse(str);
            JSONArray arr = (JSONArray) obj;
            Iterator<String> it = arr.iterator();
            while (it.hasNext()) {
                JSONObject jsonObj = (JSONObject)(Object)it.next();
                result.add(new Person((String) jsonObj.get("фамилия"),
                        (String) jsonObj.get("оценка"),
                        (String) jsonObj.get("предмет")));
            }
            return result;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString(){
        return "Студент " + lastName + " получил " + mark + " по предмету " + subject + ".";
    }
}
