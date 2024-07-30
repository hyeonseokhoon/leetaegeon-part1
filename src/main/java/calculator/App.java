package calculator;

import java.util.*;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();


       int result = 0;


       // int[] boxList = new int[10];
        int lastIndex = 0;
        ArrayList<Integer> boxList = new ArrayList<Integer> ();

        do {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("num1, num2 = " + num1 + "," + num2);

            System.out.print("사칙연산 기호를 입력해주세요: ");
            char operator = sc.next().charAt(0);

            //try {
                calculator.calc(num1, num2, operator);
                calculator.remove();
          //  } catch(BadInputException e) {
           //     System.out.println(e.getMessage());
          //  }
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
                    break;
                default:
                    System.out.println("잘못된 연산자 입력");
                    break;

            }

            System.out.println("결과:" + result);

            boxList.add(result);

           // boxList[lastIndex] = result;
           // lastIndex++;
           // int remain = 10 - lastIndex;

           // System.out.println("저장 공간이 " + remain + " 남았습니다.");
           /* if(lastIndex > boxList.length-1){
                System.out.println("저장 공간이 가득차 첫번째 결과값을 지우고 이번 결과 값을 넣었습니다.");
                for(int i = 0; i < boxList.length-1; i++){
                    boxList[i] = boxList[i+1];
                }
                boxList[boxList.length-1] = result;
            } */
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            if(remove.equals("remove")){
                boxList.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            String str = boxList.toString();
            if(inquiry.equals("inquiry")){
                for(int i=0; i<boxList.size(); i++) {
                    System.out.println(boxList.get(i));
                }
            }


            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)");

        } while (!sc.next().equals("exit"));
            }
            }





