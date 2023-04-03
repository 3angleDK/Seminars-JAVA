package tasks;

//1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Task3 {

    public static Stack<Integer> stack = new Stack<>();
    public static Deque<Integer> queque = new ArrayDeque<>();

    public static void addArrayToStack(int[] arr){
        for (int item:arr) {
            stack.add(item);
        }
    }

    public static void addArrayToQueue(int[] arr){
        for (int item:arr) {
            queque.push(item);
        }
    }

}
