package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException { //나는 여기서 처리 못하니까 던질거야

        // 문제 상황 발생 시 예외 터트리는 법 -> 예외 발생
        throw new MyCheckedException("ex");

    }
}
