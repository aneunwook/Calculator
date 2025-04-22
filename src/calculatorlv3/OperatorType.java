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

    public String getSymbol() {
        return symbol;
    }

    public static OperatorType operatorChar (char symbol){
        for(OperatorType op : OperatorType.values()){
            if(op.getSymbol().charAt(0) ==  symbol){
                return op;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 연산자입니다: " + symbol);

    }
}
