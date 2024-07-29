package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    List<Integer> test12 = new ArrayList<>();


        public int calculator(int num1, int num2, char operator) {
            int result = 0;

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
            test12.add(result);
            return result;
        }


    }

