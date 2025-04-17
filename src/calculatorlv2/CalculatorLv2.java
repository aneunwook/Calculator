package calculatorlv2;

import java.util.*;

public class CalculatorLv2 {
    private List<Integer> results = new ArrayList<>();

    public int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public int sub(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public int mul(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public int div(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    public int calculator(int num1, int num2, char op) {
        int result = 0;

        switch (op) {
            case '+':
                result = sum(num1, num2);
                break;
            case '-':
                result = sub(num1, num2);
                break;
            case '*':
                result = mul(num1, num2);
                break;
            case '/':
                result = div(num1, num2);
                break;
        }
        return result;
    }



}
