package Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может
// иметь несколько телефонов и у человека уникальное имя. Поработать с методами Map.

public class PhoneBook {
    private static Map<String, String> phones = new HashMap<>();
    public void appendPhone(String phone, String name){
        phones.put(phone, name);
    }
    public void printAll(){
        for (String ph: phones.keySet()) {
            System.out.printf("%s : %s\n", phones.get(ph), ph);
        }
    }
    public List<String> getPhones(String name){
        List<String> res = new ArrayList<>();
        for (String ph:phones.keySet()) {
            if (phones.get(ph).equals(name))
                res.add(ph);
        }
        return res;
    }
}
