package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {

        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger); //10 -> toString() 오버라이딩 해놨음 자바가
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals " + newInteger.equals(integerObj));
    }
}
