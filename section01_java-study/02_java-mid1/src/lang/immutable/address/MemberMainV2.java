package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        // 회원A, 회원B의 처음 주소지는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);


        // 회원 B의 주소를 부산으로 변경
//        memberB.getImmutableAddress().setValue("부산"); // 어라 왜 setValue가 없지?? 아 불변이구나 (컴파일오류)
        memberB.setImmutableAddress(new ImmutableAddress("부산"));
        System.out.println("q부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
