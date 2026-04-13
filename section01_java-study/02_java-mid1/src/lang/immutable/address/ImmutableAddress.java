package lang.immutable.address;

public class ImmutableAddress {
    private final String value; // 변경하는게 불가능함

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }


//    public void setValue(String value) {
//        this.value = value;
//    }

}
