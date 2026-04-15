package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        // 각각 인스턴스 타입 확인
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        // ENUM은 toString이 자기 이릅을 뱉도록 오버라이드 되어있다
        System.out.println("ref BASIC: " + Grade.BASIC); // BASIC

        System.out.println("ref BASIC: " + refValue(Grade.BASIC));
        System.out.println("ref GOLD: " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND: " + refValue(Grade.DIAMOND));


    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
