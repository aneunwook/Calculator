package calculatorlv2;

import java.util.*;

public class CalculatorLv2 {
    // 계산 결과들을 저장하는 리스트
    private List<Integer> results = new ArrayList<>();

    // 덧셈 연산
    public int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // 뺄셈 연산
    public int sub(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    // 곱셈 연산
    public int mul(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    // 나눗셈 연산
    public int div(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    // 연산자에 따라 해당 연산 메서드를 호출하는 로직
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

    // 계산 결과 리스트를 반환
    public List<Integer> getResults(){
        return results;
    }

    // 새로운 결과값을 리스트에 추가
    public void setResults(int result){
        this.results.add(result);
    }

    // 가장 오래된 결과값을 리스트에서 제거
    public void removeResult(){
            this.results.remove(0);

    }

}
