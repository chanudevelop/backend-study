package generic.test.ex1;

public class Container<T> {

    private T item;

    public void setItem(T data) {
        item = data;
    }

    public T getItem() {
        return item;
    }

    public boolean isEmpty() {
        // 내가 boolean일때 if 있으면 없이 하는거 생각해보라고 했지ㅡㅡ
        return item == null;
//        if (item == null) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
