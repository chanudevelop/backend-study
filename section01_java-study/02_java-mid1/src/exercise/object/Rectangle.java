package exercise.object;

import java.util.Objects;

public class Rectangle {
    // 필드(멤버변수)
    private int width; // 넓이
    private int height; // 높이
    // 생성자
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }
}
