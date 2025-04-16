package calculatorlv1;

import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        char op;

        while (true) {
            System.out.print("첫 번째 수 를 입력하세요: ");
            num1 = sc.nextInt();

            System.out.print("연산자를 선택해 주세요(+, -, *, /): ");
            op = sc.next().charAt(0);

            System.out.print("두 번째 수 를 입력하세요: ");
            num2 = sc.nextInt();

            int result = 0;

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
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    }
                    result = num1 / num2;
                    break;
            }

            System.out.println("결과 : " + result);
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");
            String keepGoing = sc.next();
            if(keepGoing.equals("exit")){
                break;
            }

        }

    }
}
