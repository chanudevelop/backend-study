package pack;

import pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); //겹치면 경로를 다 적어줘야한다.
    }
}
