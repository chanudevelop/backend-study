package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    // Box<T>라는 제네릭 타입을 받아서 출력하는 함수
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // ?에 다 들어올 수 있다
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName()); // 상한이 Animal이니까 Animal의 기능을 쓸 수 있다
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName()); // 상한이 Animal이니까 Animal의 기능을 쓸 수 있다
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }
    static Animal printAndReturnWildCard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
