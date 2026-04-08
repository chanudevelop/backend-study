package access.b;

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterrMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 다른 패키지의 클래스 접근 불가
//        DefaultClass1 class1 = new DefaultClass1(); // 다른패키지의 Default 클래스라서
//        DefaultClass2 class2 = new DefaultClass2(); // 다른패키지의 Default 클래스라서
    }
}
