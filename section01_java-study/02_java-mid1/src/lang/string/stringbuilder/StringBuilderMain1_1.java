package lang.string.stringbuilder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("H");
        sb.append("E");
        sb.append("L");
        sb.append("L");
        sb.append("O");
        System.out.println("sb = " + sb);

        // 문자열을 조작하는 함수
        sb.insert(5, "JAVA");
        System.out.println("sb: " + sb);

        sb.delete(5, 9);
        System.out.println("sb: " + sb);

        sb.reverse();
        System.out.println("sb: " + sb);

        // StringBuilder -> String
        String finalString = sb.toString();
        System.out.println(finalString);
    }
}
