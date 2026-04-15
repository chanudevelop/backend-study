package exercise.enumeration;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = sc.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
        authGrade.printMenu(authGrade);
    }
}
