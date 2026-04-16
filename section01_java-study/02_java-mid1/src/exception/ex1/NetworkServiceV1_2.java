package exception.ex1;


public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data); // 추가

        String connectResult = client.connect(); // success, error 반환
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류코드: " + connectResult);
            return; // 오류 발생 시 종료
        }
        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류코드: " + sendResult);
            return; //오류 발생 시 종료
        }

        client.disconnected();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
