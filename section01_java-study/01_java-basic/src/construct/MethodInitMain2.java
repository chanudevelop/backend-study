package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for(MemberInit s : members){
            System.out.println(s.name + " " + s.age  + " " + s.grade);
        }

    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = "user1";
        member.age = 15;
        member.grade = 90;
    }
}
