package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object object) { // Object obj = dog -> 부모는 자식을 담을 수 있다.
        // obj.sound()
        // obj.move()

        // 객체에 맞는 다운캐스팅 필요
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();
        }
    }
}
