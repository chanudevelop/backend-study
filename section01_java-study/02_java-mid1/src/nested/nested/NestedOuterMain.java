package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();// 안에꺼 생성
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
