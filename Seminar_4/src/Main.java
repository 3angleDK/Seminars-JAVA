import tasks.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        // Task 1
        String str;
        System.out.println("Добавляем строки в список в формате 'value:number'. Команды:\n" +
                " - string:num - добавляет в спсок строку 'string' в позицию num;\n" +
                " - print:num - выводит на экран элемент с индексом num и удаляет его;\n" +
                " - allprint - выводит на экран весь список;\n" +
                " - quit - выход из программы.");
        do{
            str = Task1.inputString("Введите строку вида text:num - ");
        } while (Task1.handleString(str));
        // Task 2
        System.out.println("Добавляем строки в очередь. Команды:\n" +
                " - print - выводит очередь на экран;\n" +
                " - revert - удаляет из очереди последнюю строку;\n" +
                " - quit - выход из программы.");
        do{
            str = Task1.inputString("Введите строку: ");
        } while (Task2.handleString(str));
        // Task 3
        int[] array = {1,5,6,8,7,9,10,13,15,19};
        Task3.addArrayToStack(array);
        System.out.println(Task3.stack);
        Task3.addArrayToQueue(array);
        System.out.println(Task3.queque);
        // Task 4
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.empty();
        System.out.println(stack);
        // Home Task 1
        LinkedList<Object> lst = new LinkedList<>();
        for (int item:array) {
            lst.add(item);
        }
        System.out.println(lst);
        HomeTask1.revers(lst);
        System.out.println(lst);
        // Home Task 2
        MyQueque queque = new MyQueque();
        queque.enqueue(1);
        queque.enqueue(2);
        queque.enqueue(3);
        System.out.println(queque);
        System.out.println(queque.first());
        System.out.println(queque.dequeue());
        System.out.println(queque);
    }
}