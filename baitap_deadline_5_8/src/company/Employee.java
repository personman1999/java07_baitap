package company;

public class Employee {
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display_info() {
        System.out.println("Tên là: " + name);
        System.out.println("Tuổi là: " + age);
        System.out.println("Lương là: " + salary);
    }

    public void calculate_salary() {
        // Phương thức tính lương (có thể được ghi đè bởi các lớp con)
    }
}
