package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        System.out.println("obj1 = " + obj1.getValue());
        // 예상 결과값: 10 이유: 기존 객체의 값에는 영향을 안줌
    }
}
