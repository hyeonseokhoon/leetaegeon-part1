package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Integer> test12 = new ArrayList<>();

    public List<Integer> getTest12() {
        return test12;
    }

    public void setTest12(List<Integer> test12) {
        this.test12 = test12;
    }

    public void remove() {
        test12.remove(0);
    }

    public int calc(int num1, int num2, char operator) {
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

