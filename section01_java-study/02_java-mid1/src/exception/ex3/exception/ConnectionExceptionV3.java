package exception.ex3.exception;

public class ConnectionExceptionV3 extends NetworkClientExceptionV3 {
    private final String address; // 어느 서버에 연결을 실패했는지

    public ConnectionExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
