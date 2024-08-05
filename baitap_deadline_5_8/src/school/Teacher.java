package school;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private String employeeId;
    private List<String> subjects;

    // Constructor
    public Teacher(String name, int age, String address, String employeeId) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.subjects = new ArrayList<>();
    }

    // Phương thức phân công môn học
    public void assign(String subject) {
        subjects.add(subject);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mã giáo viên: " + getEmployeeId());
        System.out.print("Các môn học đã phân công: ");
        for (String subject : subjects) {
            System.out.print(subject + " ");
        }
        System.out.println();
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
