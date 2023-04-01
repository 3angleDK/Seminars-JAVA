package tasks;

//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
//Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private static List<String> planets = new ArrayList<String>();
    static {
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Jupiter");
        planets.add("Neptune");
        planets.add("Venus");
        planets.add("Mars");
    }

    public static void getCopiesCount(){
        List<String> result = new ArrayList<String>();
        List<Integer> counts = new ArrayList<Integer>();
        for (String pl:planets) {
            int index = result.indexOf(pl);
            if (index < 0){
                result.add(pl);
                counts.add(1);
            }
            else {
                counts.set(index, counts.get(index) + 1);
            }
        }
        for (int i = 0; i < result.size(); i++){
            System.out.printf("%s : %d\n", result.get(i), counts.get(i));
        }
    }

    public static void removeCopies(){
        List<String> result = new ArrayList<String>();
        System.out.printf("Исходный список: %s\n",planets.toString());
        int i = 0;
        while (i < planets.size()) {
            if (result.contains(planets.get(i))){
                planets.remove(i);
            }
            else {
                result.add(planets.get(i));
                i++;
            }
        }
        System.out.printf("Список после удаления дублей: %s\n",planets.toString());
    }
}
