package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod()를 실행 - 보통 instanceof를 쓰는 이유는 확인하고 다운캐스팅하려고다.
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            // Child 인스턴스 경우에는 다운캐스팅 OK이다!! (Parent인스턴스면 불가능!)
            child = (Child) parent;
            child.childMethod();
        }

    }
}
