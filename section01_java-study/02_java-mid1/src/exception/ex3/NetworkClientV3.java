package exception.ex3;


import exception.ex3.exception.ConnectionExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address; // 접근할 서버 주소

    // 오류 시뮬레이션을 위한 값
    public boolean connectError; // 기본값은 false
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectionExceptionV3 { // 반환값도 이제 필요없다 VOID
        if (connectError) {
            // 연결 에러가 발생하면 예외를 터트리겠다.
            throw new ConnectionExceptionV3(address, address + " 서버 연결 실패");
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패: " + data);
        }

        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public String disconnected() {
        System.out.println(address + " 서버 연결 해제");
        return "success";
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        } else if (data.contains("error2")) {
            sendError = true;
        }
    }
}
