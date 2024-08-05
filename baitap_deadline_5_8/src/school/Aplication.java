package school;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin học sinh
        System.out.println("Nhập thông tin học sinh:");
        System.out.print("Tên: ");
        String studentName = scanner.nextLine();
        System.out.print("Tuổi: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Địa chỉ: ");
        String studentAddress = scanner.nextLine();
        System.out.print("Mã sinh viên: ");
        String studentId = scanner.nextLine();

        Student student = new Student(studentName, studentAge, studentAddress, studentId);

        // Nhập thông tin giáo viên
        System.out.println("\nNhập thông tin giáo viên:");
        System.out.print("Tên: ");
        String teacherName = scanner.nextLine();
        System.out.print("Tuổi: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Địa chỉ: ");
        String teacherAddress = scanner.nextLine();
        System.out.print("Mã giáo viên: ");
        String employeeId = scanner.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherAge, teacherAddress, employeeId);

        // Nhập thông tin khóa học
        System.out.println("\nNhập thông tin khóa học:");
        System.out.print("Tên khóa học: ");
        String courseName = scanner.nextLine();
        System.out.print("Mã khóa học: ");
        String courseCode = scanner.nextLine();

        Course course = new Course(courseName, courseCode);

        // Phân công giáo viên cho khóa học
        course.assignTeacher(teacher);

        // Ghi danh sinh viên vào khóa học
        student.enroll(course);

        // Hiển thị thông tin
        System.out.println("\nThông tin học sinh:");
        student.displayInfo();

        System.out.println("\nThông tin giáo viên:");
        teacher.displayInfo();

        System.out.println("\nThông tin khóa học:");
        course.displayInfo();

        scanner.close();
    }
}
