package calculatorlv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

            int result = 0;

            // 연산자에 따른 계산 실행
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;

            }

            System.out.println("결과 : " + result);

            // 계산 계속 여부 확인
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            String keepGoing = sc.next();
            if(keepGoing.equals("exit")){
                break;
            }

        }

    }
}

