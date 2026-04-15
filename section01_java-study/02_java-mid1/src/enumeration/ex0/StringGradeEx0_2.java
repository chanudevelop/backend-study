package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        // 문자열을 입력하는 방식은, 오타가 발생하기 쉽고, 유효하지 않는 값이 입력될 수 있다.
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 할인 금액: " + vip);

        // 오타 입력
        int diamondd = discountService.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 할인 금액: " + diamondd);

    }
}
