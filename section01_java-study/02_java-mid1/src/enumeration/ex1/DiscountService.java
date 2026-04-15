package enumeration.ex1;

public class DiscountService {
    // 할인 기능을 제공하는 서비스
    public int discount(String grade, int price) {
        int discountPercent = 0; // 기본형 초기화

        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " : 할인 안해");
        }

        return price * discountPercent / 100;
    }
}
