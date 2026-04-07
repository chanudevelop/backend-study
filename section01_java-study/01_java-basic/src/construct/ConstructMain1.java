package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("유저1", 26, 100);
        MemberConstruct member2 = new MemberConstruct("유저2", 16, 70);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println(s.name + " " + s.age  + " " + s.grade);

        }

    }
}
