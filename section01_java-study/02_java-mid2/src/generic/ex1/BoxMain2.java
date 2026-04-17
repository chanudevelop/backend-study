package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer)integerBox.get(); // 다운캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        // 잘못된 타입으 인수 전달 시 (실수로 숫자가 들어가길 기대했는데 문자가 들어감..)
        integerBox.set("문자열100");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스킹 예외
        System.out.println("result = " + result);

    }
}
