package exception.ex4;

import exception.ex4.exception.ConnectionExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable{

    // 이게 try구문이 끝날 때 자동으로 호출된다.
    @Override
    public void close() {
        System.out.println("NetworkClientV5.close");
        disconnected();
    }

    private final String address; // 접근할 서버 주소

    // 오류 시뮬레이션을 위한 값
    public boolean connectError; // 기본값은 false
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect(){
        if (connectError) {
            throw new ConnectionExceptionV4(address, address + " 서버 연결 실패");
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data)  {
        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
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
