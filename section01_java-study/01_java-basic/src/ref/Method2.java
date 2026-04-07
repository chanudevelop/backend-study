package ref;

public class Method2 {

    public static void main(String[] args) {
        // 생성하면서 초기화 하도록 수정
        Student student1 = createStudent("학생1", 18, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudentInfo(student1);
        printStudentInfo(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    static void printStudentInfo(Student student){
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
