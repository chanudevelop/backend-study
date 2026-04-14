package lang.system;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다. - 운영체제
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다. - 자바가 사용하는 시스템 환경 속성
        System.out.println("properties = " + System.getProperties());
        System.out.println("properties = " + System.getProperty("java.version"));
    }
}
