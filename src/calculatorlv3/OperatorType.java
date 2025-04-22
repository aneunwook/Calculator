package calculatorlv3;

public enum OperatorType {
    SUM("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");

    private final String symbol;

    OperatorType(String symbol) {
        this.symbol = symbol;
    }
}
