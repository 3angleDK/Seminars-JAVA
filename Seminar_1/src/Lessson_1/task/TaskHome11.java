package Lessson_1.task;

import java.util.Scanner;

//Реализовать простой калькулятор
public class TaskHome11 {
    private static double GetNumber(String prompt){
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.next());
    }

    private static String GetOperation(){
        System.out.print("Введите операцию (* / + -): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void RunCalculator(){
        double a = GetNumber("Введите первое число: ");
        String op = GetOperation();
        double b = GetNumber("Введите второе число: ");
        double res;
        switch (op){
            case "*": res = a * b;
                break;
            case "/": res = a / b;
                break;
            case "+": res = a + b;
                break;
            case "-": res = a - b;
                break;
            default: System.out.println("Неверная операция!");
            return;
        }
        System.out.printf("a " + op + " b = %f", res);
    }
}
