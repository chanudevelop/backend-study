package ref;

public class NullMain3 {
    public static void main(String[] args) {

        BigData bigData = new BigData();
        System.out.println("bigdata.count = " + bigData.count); // 초기값인 0
        System.out.println("bigdata.data = " + bigData.data); // 참조형의 초기값인 null

//        System.out.println("bigData.data.value: " + bigData.data.value); // nullPointerException 발생하겠다.

        bigData.data = new Data();
        System.out.println("bigdata.data = " + bigData.data);
        System.out.println("bigData.data.value: " + bigData.data.value);
    }
}
