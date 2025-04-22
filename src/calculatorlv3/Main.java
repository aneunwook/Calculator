package calculatorlv3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 제네릭 타입을 Double로 지정한 객체 생성
        ArithmeticCalculator<Double> arithmeticCalculator = new ArithmeticCalculator();

        double num1;
        double num2;
        OperatorType op;

        while (true) { // 전체 반복 루프
            // 첫 번째 수 입력 받기
            while (true) {
                try{
                    System.out.print("첫 번째 수 를 입력하세요: ");
                    num1 = sc.nextDouble();
                    break;

                }catch (InputMismatchException e){
                    System.out.println("숫자만 입력해주세요!");
                    sc.nextLine();
                }
            }

            // 연산자 입력 받기 (+, -, *, /)
            while (true){
                try{
                    System.out.print("연산자를 선택해 주세요(+, -, *, /): ");
                    op = OperatorType.operatorChar(sc.next().charAt(0));
                    break;
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }
            }

            // 두 번째 수 입력 받기
            while (true){
                try {
                    System.out.print("두 번째 수 를 입력하세요: ");
                    num2 = sc.nextDouble();

                    if(op == OperatorType.DIV && num2 == 0){
                        throw new ArithmeticException();
                    }

                    break;

                }catch (ArithmeticException e){
                    System.out.println("0으로 나눌 수 없습니다!");
                    sc.nextLine();
                }catch (InputMismatchException e){
                    System.out.println("숫자만 입력해주세요!");
                    sc.nextLine();
                }
            }

            // 계산 수행
            double result = arithmeticCalculator.calculator(num1, num2, op);
            System.out.println("결과 :" + result);
            arithmeticCalculator.setResults(result);
            sc.nextLine();

            // 계산 이후 기능 선택
            boolean keep = true;

            while (keep) {
                System.out.println("1. 계산하기 || 2. 계산 이력 || 3. 계산 이력 삭제 || 4. 입력한 값보다 큰 값 확인하기 || 5. 계산기 종료");
                String command = sc.nextLine();

                switch (command) {
                    case "1":
                        keep = false;
                        break;
                    case "2":
                        System.out.println("계산 이력 :" + arithmeticCalculator.getResults());
                        break;
                    case "3":
                        arithmeticCalculator.removeResult();
                        System.out.println("삭제 되었습니다!");
                        break;
                    case "4":
                        System.out.print("확인하고 싶은 수를 입력하세요: ");
                        double value = sc.nextDouble();
                        sc.nextLine();

                        List<Double> doubles = arithmeticCalculator.printBiggerThanInput(value);
                        System.out.println("결과 = " + doubles);
                        break;
                    case "5":
                        System.out.print("exit 입력 시 종료");
                        String keepGoing = sc.nextLine();
                        if(keepGoing.equals("exit")){
                            System.exit(0);
                        }
                        break;
                }
            }

        }

    }
}
