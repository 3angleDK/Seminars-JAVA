package Tasks;


//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков (Set).
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

import java.util.*;

public class Notebook {
    public String firm;
    public int mem;
    public int hdd;
    public String os;
    public String color;
    private static Map<String, Object> filter = new HashMap<>(); //Map.of("mem", "0", "hdd", "0", "color", "", "os", "");
    public Notebook(String firm, int mem, int hdd, String os, String color){
        this.firm = firm;
        this.mem = mem;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public static void getFilter(){
        while (true){
            System.out.println("Add filter:");
            System.out.println("1. Memory.");
            System.out.println("2. HDD.");
            System.out.println("3. Color.");
            System.out.println("4. Operating system.");
            System.out.println("5. Quit.");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter minimum memory volume: ");
                    filter.put("mem", scan.nextInt());
                    break;
                case 2:
                    System.out.print("Enter minimum HDD volume: ");
                    filter.put("hdd", scan.nextInt());
                    break;
                case 3:
                    System.out.print("Enter notebook color: ");
                    filter.put("color", scan.nextLine());
                    break;
                case 4:
                    System.out.print("Enter Operating systemv: ");
                    filter.put("os", scan.nextLine());
                    break;
                case 5:
                    return;
            }
        }
    }

    public static Set<Notebook> getFilteredSet(Set<Notebook> set){
        Set<Notebook> res = new HashSet<>();
        for (Notebook item: set) {
            boolean flag = true;
            for (String key: filter.keySet()) {
                switch (key){
                    case "mem":
                        flag = flag && (item.mem >= (Integer) filter.get(key));
                        break;
                    case "hdd":
                        flag = flag && (item.hdd >= (Integer) filter.get(key));
                        break;
                    case "color":
                        flag = flag && ((String)filter.get(key) == "" || item.color == (String) filter.get(key));
                        break;
                    case "os":
                        flag = flag && ((String)filter.get(key) == "" || item.os == (String) filter.get(key));
                        break;
                }
            }
            if (flag)
                res.add(item);
        }
        return res;
    }
    @Override
    public String toString() {
        return firm + ", memory = " + Integer.toString(mem) +
                " Gb, HDD = " + Integer.toString(hdd) +
                " Gb, OS: " + os +
                ", Color: " + color;
    }

    @Override
    public int hashCode() {
        return firm.hashCode()+mem + hdd + color.hashCode() + os.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Notebook) {
            Notebook other = (Notebook) obj;
            return firm == other.firm &&
                   mem == other.mem &&
                   hdd == other.hdd &&
                   os == other.os &&
                   color == other.color;
        }
        else return false;
    }
}
