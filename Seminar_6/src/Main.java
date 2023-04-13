import Tasks.Notebook;
import Tasks.Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Task 1
//        System.out.println(Task1.getUniquePercent(Task1.fillArray(1000)));
        // Home task
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Apple", 16, 250, "Mac OS", "red"));
        notebooks.add(new Notebook("Apple", 8, 250, "Mac OS", "white"));
        notebooks.add(new Notebook("Apple", 32, 500, "Mac OS", "grey"));
        notebooks.add(new Notebook("Apple", 16, 1000, "Mac OS", "white"));
        notebooks.add(new Notebook("Apple", 16, 250, "Mac OS", "white"));
        notebooks.add(new Notebook("MSI", 4, 250, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 8, 250, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 8, 500, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 16, 250, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 16, 250, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 16, 500, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 32, 1000, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 32, 1000, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 32, 1000, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 32, 1000, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 32, 1000, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 32, 1000, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 32, 1000, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 32, 1000, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 32, 1000, "Windows", "white"));
        notebooks.add(new Notebook("MSI", 32, 1000, "Windows", "white"));
        Set<Notebook> notebookSet = new HashSet<>(notebooks);
        printSet(notebookSet);
        Notebook.getFilter();
        Set<Notebook> filteredSet = Notebook.getFilteredSet(notebookSet);
        printSet(filteredSet);
    }
    static void printSet(Set<Notebook> set){
        for (Notebook notebook: set ) {
            System.out.println(notebook);
        }
    }
}