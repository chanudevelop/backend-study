package exception.basic.unchecked;

/**
 * UnChecked 예외는
 * 예외를 잡거나, 던지지 않아도 된다.
 * 예외를 잡지 않으면 자동으로 밖으로 던진다.
 */
public class Service {
    Client client = new Client();

    /**
     * 필요한 경우 예외를 잡아서 처리할 수 있다
     */
    public void callCatch() {
        try{
            client.call();
        }catch(MyUnCheckedException e){
            // 예외처리 로직
            System.out.println("예외처리, message = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }
    /**
     * 체크예외와 다르게 언체크예외는
     * 예외를 잡지 않아도 된다. -> 저연스럽게 상위로 넘어간다
     * 체크예외와 다르게 throws 예외 선언을 하지 않아도 된다.*/
    public void callThrow() {
        client.call();
    }

}
