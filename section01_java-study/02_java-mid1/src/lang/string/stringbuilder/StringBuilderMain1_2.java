package lang.string.stringbuilder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("H").append("E").append("L").append("L").append("O")
                .insert(5, "JAVA")
                .delete(5, 9)
                .reverse()
                .toString();
        System.out.println("sb = " + sb);

        System.out.println(string);
    }
}
