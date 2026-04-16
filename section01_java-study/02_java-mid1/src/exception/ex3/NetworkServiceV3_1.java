package exception.ex3;


import exception.ex3.exception.ConnectionExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data); // 추가

        try {
            client.connect();
            client.send(data);
        } catch (ConnectionExceptionV3 e) {
            // 어떤 오류가 발생했는지에 따라서 오류메세지를 디테일하게 다르게 작성할 수 있다(다른 로직 가능)
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnected();
        }
    }
}
