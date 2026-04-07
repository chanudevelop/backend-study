package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
//    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//    }

    // this() 사용
    MemberConstruct(String name, int age) {
        this(name, age, 50);
        System.out.println("나 들렸다가~~");
    }


    //  이름이 클래스명과 동일
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
