package generic.ex1;

public class GenericBox<T> {
    private T value; // T가 Type이 된다

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
