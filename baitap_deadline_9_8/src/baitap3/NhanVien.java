package baitap3;

import java.util.Scanner;

public class NhanVien {
    protected String hoTen;
    protected String ngaySinh;
    protected double luong;

    // Phương thức khởi tạo
    public NhanVien(String hoTen, String ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.luong = 0.0;
    }

    // Phương thức nhập thông tin chung
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        this.ngaySinh = scanner.nextLine();
    }

    // Phương thức xuất thông tin chung
    public void xuatThongTin() {
        System.out.printf("Họ tên: %s\n", hoTen);
        System.out.printf("Ngày sinh: %s\n", ngaySinh);
        System.out.printf("Lương: %.2f VND\n", luong);
    }

    // Phương thức tính lương (sẽ được ghi đè trong các lớp con)
    public void tinhLuong() {

    }
}
