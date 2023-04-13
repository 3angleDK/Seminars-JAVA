package Tasks;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//        Пример 1: a+(d*3) - истина
//        Пример 2: [a+(1*3) - ложь
//        Пример 3: [6+(3*3)] - истина
//        Пример 4: {a}[+]{(d*3)} - истина
//        Пример 5: <{a}+{(d*3)}> - истина
//        Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task2 {

    static Stack<Character> characters = new Stack<>();
    public static void main(String[] args) {
        System.out.println(isValid("{[A([B}])]C"));
    }
    //"(" : ")"

    public static boolean isValid(String arg) {
        Map<Character, Character> map = Map.of(')', '(', ']', '[', '}', '{','>', '<');
        Stack<Character> stack = new Stack<>();
        for (Character ch: arg.toCharArray()) {
            if (map.containsValue(ch)){
                stack.push(ch);
            }
            if(map.containsKey(ch)){
                if (map.get(ch) != stack.pop()){
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
