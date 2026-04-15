package enumeration.ex2;


public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        //  x001 == x001
        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("NO");
        }

        return price * discountPercent / 100;
    }
}