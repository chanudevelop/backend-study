package poly.car1;

public class Driver {

    // 역할만 알고 있다
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine(); // 오버라이드로 메서드 찾아가서 실행가능
        car.pressAccelerator();
        car.offEngine();
    }
}
