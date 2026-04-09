package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {

        // 인스턴스 변수, 메소드에 접근 불가-> 컴파일 오류
//        instanceValue++;
//        instanceMethod();

        // 정적 변수,메소드에 접근
        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        // 인스턴스 변수, 메소드에 접근 rksmd
        instanceValue++;
        instanceMethod();

        // 정적 변수,메소드에 접근
        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instance메소드 실행");
    }

    private static void staticMethod() {
        System.out.println("static메소드 실행");
    }
}
