package baitap3;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien {
    private int soSanPham;

    public NhanVienSanXuat(String hoTen, String ngaySinh, int soSanPham) {
        super(hoTen, ngaySinh);
        this.soSanPham = soSanPham;
    }

    // Ghi đè phương thức tính lương
    @Override
    public void tinhLuong() {
        this.luong = 5000 * soSanPham;
    }

    // Ghi đè phương thức nhập thông tin
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số sản phẩm: ");
        this.soSanPham = scanner.nextInt();
    }

    // Ghi đè phương thức xuất thông tin
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Số sản phẩm: " + soSanPham);
    }
}
