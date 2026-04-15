package exercise.enumeration;

public class AuthGradeMain1 {

    public static void main(String[] args) {

        AuthGrade[] values = AuthGrade.values(); // 배열로 뽑아내기
        for (AuthGrade value : values) {
            System.out.println("grade= " + value.name() +
                    " level= " + value.getLevel() +
                    " 설명= " + value.getDescription());
        }
    }
}
