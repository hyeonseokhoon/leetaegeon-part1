package calculator;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int result = 0;

        int[] boxlist = new int[10];
        int lastIndex = 0;

        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("num1, num2 = " + num1 + "," + num2);

            System.out.print("사칙연산 기호를 입력해주세요: ");
            char operator = sc.next().charAt(0);

            System.out.println("operator =" + operator);


            switch (operator) {
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
                    break;
                case '%':
                    result = num1 % num2;
                default:
                    System.out.println("잘못된 연산자 입력");
                    break;

            }

            System.out.println("결과:" + result);



            boxlist[lastIndex] = result;
            lastIndex++;
            int remain = 10 - lastIndex;

            System.out.println("저장 공간이 " + remain + " 남았습니다.");


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

        } while (!sc.next().equals("exit"));
            }
            }





