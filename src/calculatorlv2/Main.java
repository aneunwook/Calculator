package calculatorlv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorLv2 calculatorLv2 = new CalculatorLv2();

        int num1;
        int num2;
        char op;

        while (true) {// 전체 반복 루프
            // 첫 번째 수 입력 받기
            while (true) {
                try{
                    System.out.print("첫 번째 수 를 입력하세요: ");
                    num1 = sc.nextInt();

                    if(num1 < 0){
                        System.out.println("음수는 입력 할 수 없습니다!");
                        continue;
                    }

                    break;

                }catch (InputMismatchException e){
                    System.out.println("정수를 입력해 주세요!!!");
                    sc.nextLine();
                }
            }

            // 연산자 입력 받기 (+, -, *, /)
            while (true){
                System.out.print("연산자를 선택해 주세요(+, -, *, /): ");
                op = sc.next().charAt(0);

                if(op != '+' && op != '-' && op != '*' && op != '/'){
                    sc.nextLine();
                    continue;
                }
                break;
            }

            // 두 번째 수 입력 받기
            while (true){
                try {
                    System.out.print("두 번째 수 를 입력하세요: ");
                    num2 = sc.nextInt();

                    if(num2 < 0){
                        System.out.println("음수는 입력 할 수 없습니다!");
                        continue;
                    }

                    if(op == '/' && num2 == 0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        continue;
                    }

                    break;

                }catch (InputMismatchException e){
                    System.out.println("정수를 입력해 주세요!!!");
                    sc.nextLine();
                }
            }

            // 계산 수행
            int result = calculatorLv2.calculator(num1, num2, op);
            System.out.println("결과 :" + result);
            calculatorLv2.setResults(result);

            System.out.println("계산 이력 :" + calculatorLv2.getResults());

            System.out.print("계산 이력을 삭제 하시겠습니까? (y or n) :");
            char remove = sc.next().charAt(0);
            if(remove == 'y'){
                calculatorLv2.removeResult();
                System.out.println("삭제 되었습니다!");
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");

            String keepGoing = sc.next();
            if(keepGoing.equals("exit")){
                break;
            }

        }

    }
}
