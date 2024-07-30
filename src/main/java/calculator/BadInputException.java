package calculator;

//입력값에 문제가 있다고 말해주는 Exception을 상속받는 InputErrorException 생성
public class BadInputException extends Exception {
    //// 생성자 , 메세지를 받는다
    public BadInputException(String msg)
    {
        //부모 생성자로 전달
        super(msg);
    }
}
