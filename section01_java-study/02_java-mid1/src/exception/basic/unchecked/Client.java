package exception.basic.unchecked;

public class Client {
    public void call() {
        throw new MyUnCheckedException("ex");
        // -> 지금 아무 오류가 안생긴다. 원래대로라면, 예외가 발생했으니까 throws를 해줘야하는데
        // unchecked는 안적어줘도 폭탄 생기면 알아서 밖으로 나간다
    }
}
