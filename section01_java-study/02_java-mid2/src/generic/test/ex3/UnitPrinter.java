package generic.test.ex3;

public class UnitPrinter {

    // 셔틀에 들어있는 유닛의 정보를 출력

    // 1. 제네릭메서드로 구현
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T unit = shuttle.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
//        shuttle.showInfo();
    }



    // 2. 와일드카드로 구현
    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit unit = shuttle.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
        // shuttle.showInfo();
    }
}
