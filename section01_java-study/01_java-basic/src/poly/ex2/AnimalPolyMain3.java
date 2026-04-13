package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

        for (Animal s : animalArr) {
            soundAnimal(s);
        }
    }

    // 변하지 않는 부분
    private static void soundAnimal(Animal animal) { // 부모는 자식을 담을 수 잇다.
        System.out.println("동물소리 테스트 시작");
        animal.sound(); // 각자의 소리가 나오는 이유는 메서드 오버라이딩
        System.out.println("동물소리 테스트 종료");
    }
}
