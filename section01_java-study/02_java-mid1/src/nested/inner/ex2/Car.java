package nested.inner.ex2;


public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.chargeLevel = chargeLevel;
        this.model = model;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작완료");
    }

    public class Engine {

        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(engine + "의 엔진을 구동합니다.");
        }
    }
}
