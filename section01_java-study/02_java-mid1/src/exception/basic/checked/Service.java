package exception.basic.checked;

public class Service {

    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드*/
    public void callCatch() {
        // client.call(); // 이 코드를 실행하면 -> throw new MyCheckedException예외가 터짐
                        // Client에서 처리를 못하니까 밖으로 던진다(throws My~ 코드 있었잖아)
                        // 그래서 throw 아래의 코드가 실행 안되고 밖으로 예외가 던져진다 (밖은 나를 호출한 곳) -> 지금 여기.
                        // 즉 지금 폭탄이 여기 와있다

        try { // 폭탄 잡기 시도
            client.call(); // == throw new MyCheckedException("ex");
        } catch (MyCheckedException e) { // 여기서 예외 잡기
            // 예외 처리 로직
            System.out.println("예외처, message = " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 'throws 예외'를 메서드에 필수로 선언해야 한다.
     */
    public void catchThrow() throws MyCheckedException {
        client.call();
    }
}
