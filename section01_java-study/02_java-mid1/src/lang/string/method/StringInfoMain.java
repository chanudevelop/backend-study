package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        // 1.  문자열 정보 조회
        String str = "Hello, Java";
        System.out.println("문자열의 길이: " + str.length()); //11
        System.out.println("문자열이 비어 있는지: " + str.isEmpty()); //false
        System.out.println("문자열이 비어 있거나 공백인지: " + str.isBlank()); //false
        System.out.println("문자열이 비어있거나 공백인지: " + "".isBlank()); //true
        System.out.println("문자열이 비어있거나 공백인지: " + "         ".isBlank()); //true

        System.out.println("n번째 인덱스의 문자: " + str.charAt(7)); //J

    }
}
