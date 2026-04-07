package class1;

public class ClassStart4 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생1"; // 클래스는 .을 통해 접근할 수 있다
        student1.age = 15;
        student1.grade=90;

        Student student2 = new Student(); // 메모리공간에 새로운 Student 하나를 만든다
        student2.name = "학생2"; 
        student2.age=16;
        student2.grade = 80;

//        Student[] students = new Student[]{student1, student2};
        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].age + " " + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.name + " " + s.age + " " + s.grade);
        }

        for( Student s : students){
            System.out.println(s.name + " " + s.age + " " + s.grade);
        }
    }
}
