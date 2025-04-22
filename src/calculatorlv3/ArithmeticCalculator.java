package calculatorlv3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    private List<T> results = new ArrayList<>();

    public List<T> getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results.add(results);
    }

    public double calculate(T num1, T num2, OperatorType op){
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

}
