package Tasks;

//Пусть дан список сотрудников: Иван (и остальные, полный текст дз будет на платформе)
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.*;
import java.util.stream.Collectors;

public class HomeTask2 {



    static String[] persons = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
            "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
            "Иван Иванов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
            "Мария Савина", "Иван Иванов", "Мария Рыкова", "Анна Крутова", "Марина Лугова",
            "Анна Владимирова", "Петр Лыков", "Иван Мечников", "Петр Петин",
            "Петр Лыков", "Иван Ежов"};
//    public static Map<String, Integer> sortByPopularity(){
    public static void sortByPopularity(){
        Map<String, Integer> res = new HashMap<>();
        for (String name: persons) {
            if (res.containsKey(name)){
                res.put(name, res.get(name) + 1);
            }
            else {
                res.put(name, 1);
            }
        }
        res.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

}
