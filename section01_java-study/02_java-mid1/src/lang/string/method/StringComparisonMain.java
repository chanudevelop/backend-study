package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {

        String str1 = "Hello, Java!"; // 대문자 일부 포함
        String str2 = "hello, java!"; // 소문자로만
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2)); //false
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); //false

        //앞에서부터 한 글자씩 비교하다가 처음 다른 문자가 나오면 그 문자들의 유니코드 값 차이를 반환
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); // 사전적 비교
        System.out.println("'c' compareTo 'a': " + "c".compareTo("a"));// 2
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));// -13
        System.out.println("str1 compareToIgnoreCase str3: " + str1.compareToIgnoreCase(str3));//

        System.out.println("str1 starts with 'Hello:" + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!"));




    }
}
