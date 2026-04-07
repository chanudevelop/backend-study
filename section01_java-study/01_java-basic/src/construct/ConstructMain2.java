package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("유저1", 26, 100);
        MemberConstruct member2 = new MemberConstruct("유저2", 16); // 기본값 50으로 정해짐

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println(s.name + " " + s.age  + " " + s.grade);

        }

    }
}
