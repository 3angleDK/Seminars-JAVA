package Lessson_1.task;
//Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1

public class Task6 {
    public static double power(double a, int b){
        double res = 1.0;
        for (int i = 0; i < Math.abs(b); i++) res *= a;
        if (b < 0) return 1.0 / res;
        else return res;
    }
}
