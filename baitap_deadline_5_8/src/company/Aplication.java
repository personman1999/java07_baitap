package company;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Employee employee = new Employee();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời nhập tên nhân viên toàn thời gian: ");
        fullTimeEmployee.setName(scanner.nextLine());
        System.out.println("Mời nhập tuổi nhân viên toàn thời gian: ");
        fullTimeEmployee.setAge(scanner.nextInt());
        System.out.println("Nhập lương nhân viên toàn thời gian: ");
        fullTimeEmployee.setSalary(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Mời nhập tên nhân viên bán thời gian: ");
        partTimeEmployee.setName(scanner.nextLine());
        System.out.println("Mời nhập tuổi nhân viên bán thời gian: ");
        partTimeEmployee.setAge(scanner.nextInt());
        System.out.println("Nhập lương nhân viên bán thời gian: ");
        partTimeEmployee.setSalary(scanner.nextInt());

        System.out.println("\nThông tin nhân viên toàn thời gian:");
        fullTimeEmployee.display_info();

        System.out.println("\nThông tin nhân viên bán thời gian:");
        partTimeEmployee.display_info();
    }
}
