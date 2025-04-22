package calculatorlv3;

// 연산자 종류를 정의하는 enum 클래스
public enum OperatorType {
    SUM("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");

    private final String symbol;

    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    // 연산 기호를 반환하는 메서드
    public String getSymbol() {
        return symbol;
    }

    // 입력한 문자(char)를 받아서 해당하는 OperatorType을 반환
    public static OperatorType operatorChar (char symbol){
        for(OperatorType op : OperatorType.values()){
            if(op.getSymbol().charAt(0) ==  symbol){
                return op;
            }
        }
        throw new IllegalArgumentException("지원하지 않는 연산자입니다!!! ");

    }
}
