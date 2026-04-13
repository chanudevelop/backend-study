package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 원래 Child 인스턴스이니까!!

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임오류
        child2.childMethod(); // Parent를 만들었기 때문에 Child는 만든적 없음!! -> 위의 오류떄문에 실행조차 안됨.
    }
}
