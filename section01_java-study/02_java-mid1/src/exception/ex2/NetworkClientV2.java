package exception.ex2;

public class NetworkClientV2 {

    private final String address; // 접근할 서버 주소

    // 오류 시뮬레이션을 위한 값
    public boolean connectError; // 기본값은 false
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 { // 반환값도 이제 필요없다 VOID
        if (connectError) {
            // 연결 에러가 발생하면 예외를 터트리겠다.
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
              throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);
            // 중간에 다른 예외가 발생했다고 가정
             // throw new RuntimeException("추가) 다른예외");
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
