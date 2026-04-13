package poly.basic;

public class CastingMain4 {
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

        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            // Child 인스턴스 경우에는 다운캐스팅 OK이다!! (Parent인스턴스면 불가능!)
            Child child = (Child) parent;
            child.childMethod();
        }

    }
}
