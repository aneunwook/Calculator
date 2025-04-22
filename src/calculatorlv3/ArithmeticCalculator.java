package calculatorlv3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    private List<T> results = new ArrayList<>();

    public List<T> getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results.add(results);
    }

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

    public void removeResult(){
        this.results.remove(0);

    }

    public List<T> printBiggerThanInput(T value){
        return results.stream()
                .filter(result -> result.doubleValue() > value.doubleValue())
                .collect(Collectors.toList());

    }

}
