package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();


        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);

        // 부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("Parent -> Child"); // 타입이 부모기 떄문에 부모에서부터 찾고 올라가야하는데
        System.out.println("value = " + poly.value); // 그럼 이건 부모 value가 나올거고
        poly.method(); // 이것도 부모 메서드가 실행되어야하는데 두둥탁!! -> child메서드가 실행됐다 why??? - method는 오버라이딩 된 메서드가 우선권을 갖음!!
    }


}
