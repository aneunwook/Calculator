package calculatorlv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {

    // 계산 결과들을 저장할 리스트
    private List<T> results = new ArrayList<>();

    // 계산 결과 리스트를 외부에서 조회
    public List<T> getResults() {
        return results;
    }

    // 계산 결과를 리스트에 추가
    public void setResults(T results) {
        this.results.add(results);
    }

    // 다양한 숫자 타입을 받아 연산을 처리하는 로직
    public double calculator(T num1, T num2, OperatorType op){
        double a = num1.doubleValue();
        double b = num2.doubleValue();
        double result = 0.0;

        switch (op){
            case SUM : result = a + b; break;
            case SUB : result = a - b; break;
            case MUL : result = a * b; break;
            case DIV : result = a / b; break;
        }

        return result;
    }

    // 저장된 결과 리스트에서 첫 번째 값을 삭제
    public void removeResult(){
        this.results.remove(0);

    }

    // 입력값보다 큰 값들만 필터링
    public List<T> printBiggerThanInput(T value){
        return results.stream()
                .filter(result -> result.doubleValue() > value.doubleValue())
                .collect(Collectors.toList());

    }

}
