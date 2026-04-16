package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {

        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();// 생성할 때 어떤 인스턴스인지 알아야한다. (= 인스턴스의 참조값을 알아야함)
        // outer인스턴스 안에 만들겠다 라는 뜻

        inner.print();

        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
