package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // 자기 자신의 클레스 생성해서 쓸 수 있다.
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
