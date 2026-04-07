package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        // this가 없다면
        /*
        * name = name;
        * age = age;
        * grade= grade
        * -> 이름이 똑같다!! 스코프상 더 가까운 매개변수로 되기 떄문에 필드를 바꾸지 못함!!!
        * */

    }
}
