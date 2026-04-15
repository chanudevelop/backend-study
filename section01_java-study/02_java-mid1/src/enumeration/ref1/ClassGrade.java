package enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10); // 참조값이 x001
    public static final ClassGrade GOLD = new ClassGrade(20); // 참조값이 x002
    public static final ClassGrade DIAMOND = new ClassGrade(30); // 참조값이 x003

    private final int discountPercent;

    public ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
