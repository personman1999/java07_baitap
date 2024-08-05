package school;

public class Course {
    private String courseName;
    private String courseCode;
    private Teacher teacher;

    // Constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Phương thức phân công giáo viên
    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    // Phương thức hiển thị thông tin khóa học
    public void displayInfo() {
        System.out.println("Tên khóa học: " + getCourseName());
        System.out.println("Mã khóa học: " + getCourseCode());
        if (teacher != null) {
            System.out.println("Giáo viên giảng dạy: " + teacher.getName());
        } else {
            System.out.println("Giáo viên giảng dạy: Chưa được phân công");
        }
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
