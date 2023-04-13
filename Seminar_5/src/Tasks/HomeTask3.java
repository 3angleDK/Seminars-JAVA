package Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class HomeTask3 {
    private static Map<Character, Integer> romeDigits = Map.of('I', 1, 'V', 5, 'X', 10,
            'L', 50, 'C', 100, 'D', 500, 'M', 1000);
    public static Integer convertRomeNumber(String value){
        Stack<Integer> stack = new Stack<>();
        for (Character ch : value.toCharArray()) {
            stack.push(romeDigits.get(ch));
        }
        int result = 0, lastDigit = 0, digit;
        while (!stack.empty()){
            digit = stack.pop();
            if (digit < lastDigit) result -= digit;
            else result += digit;
            lastDigit = digit;
        }
        return result;
    }
}
