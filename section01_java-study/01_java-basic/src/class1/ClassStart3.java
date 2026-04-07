package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 학생을 실제 메모리를 만듬(이제 쓸 수 있음)
        student1.name = "학생1"; // 클래스는 .을 통해 접근할 수 있다
        student1.age = 15;
        student1.grade=90;

        Student student2 = new Student(); // 메모리공간에 새로운 Student 하나를 만든다
        student2.name = "학생2";
        student2.age=16;
        student2.grade = 80;

        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
        System.out.println(student2.name + " " + student2.age + " " + student2.grade);
    }
}
