package school;

public class Person {
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Tên: " + getName());
        System.out.println("Tuổi: " + getAge());
        System.out.println("Địa chỉ: " + getAddress());
    }


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
