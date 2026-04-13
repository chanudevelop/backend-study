package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Animal[] animalArr = {dog, cat, cow};
        for (Animal s : animalArr) {
            soundAnimal(s);
        }
    }

    private static void soundAnimal(Animal animal) { // 부모는 자식을 담을 수 잇다.
        System.out.println("동물소리 테스트 시작");
        animal.sound(); // 각자의 소리가 나오는 이유는 메서드 오버라이딩
        System.out.println("동물소리 테스트 종료");
    }
}
