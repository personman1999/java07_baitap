package school;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private List<Course> courses;

    // Constructor
    public Student(String name, int age, String address, String studentId) {
        super(name, age, address);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    // Phương thức ghi danh vào khóa học
    public void enroll(Course course) {
        courses.add(course);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mã sinh viên: " + getStudentId());
        System.out.print("Các khóa học đã đăng ký: ");
        for (Course course : courses) {
            System.out.print(course.getCourseName() + " ");
        }
        System.out.println();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
