package exception.ex4.exception;


public class ConnectionExceptionV4 extends NetworkClientExceptionV4 {
    private final String address; // 어느 서버에 연결을 실패했는지

    public ConnectionExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
