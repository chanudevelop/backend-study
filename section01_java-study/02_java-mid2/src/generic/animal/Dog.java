package generic.animal;

public class Dog extends Animal {
    public Dog(String name, int size) {
        super(name, size); // 부모에 생성자가 있으니까 불러줘야한다.
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
