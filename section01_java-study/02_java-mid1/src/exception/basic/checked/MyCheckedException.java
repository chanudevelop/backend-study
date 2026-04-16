package exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 * */
public class MyCheckedException extends Exception {
    // 오류 메세지를 받아서 부모에 저장한다. (Exception에 보관하는 기능을 제공해준다)
    public MyCheckedException(String message) {
        super(message);
    }
}
