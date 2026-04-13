package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {

        //참조형 변수는 하나의 인스턴스를 공유할 수 있따.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다!!!!

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산"); //대신 인스턴스 속성을 바꿀 수 없게 막아버림!!!-> 불변객체!
        // 아 값을 못바꾸네..!! 새로운 객체에다가 남아야겠다.
        b = new ImmutableAddress("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
