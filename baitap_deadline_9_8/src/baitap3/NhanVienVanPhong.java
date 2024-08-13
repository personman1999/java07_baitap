package baitap3;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien {
    private int soNgayLamViec;

    public NhanVienVanPhong(String hoTen, String ngaySinh, int soNgayLamViec) {
        super(hoTen, ngaySinh);
        this.soNgayLamViec = soNgayLamViec;
    }

    // Ghi đè phương thức tính lương
    @Override
    public void tinhLuong() {
        this.luong = soNgayLamViec * 100000;
    }

    // Ghi đè phương thức nhập thông tin
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số ngày làm việc: ");
        this.soNgayLamViec = scanner.nextInt();
    }

    // Ghi đè phương thức xuất thông tin
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Số ngày làm việc: " + soNgayLamViec);
    }
}
