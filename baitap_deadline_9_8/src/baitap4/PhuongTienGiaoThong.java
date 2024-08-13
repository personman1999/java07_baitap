package baitap4;

import java.util.Scanner;

public class PhuongTienGiaoThong {
    protected String hangSanXuat;
    protected String tenPhuongTien;
    protected int namSanXuat;
    protected double vanTocToiDa;

    // Hàm khởi tạo không tham số
    public PhuongTienGiaoThong() {}

    // Hàm khởi tạo có tham số
    public PhuongTienGiaoThong(String hangSanXuat, String tenPhuongTien, int namSanXuat, double vanTocToiDa) {
        this.hangSanXuat = hangSanXuat;
        this.tenPhuongTien = tenPhuongTien;
        this.namSanXuat = namSanXuat;
        this.vanTocToiDa = vanTocToiDa;
    }

    // Phương thức nhập thông tin phương tiện giao thông
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hãng sản xuất: ");
        hangSanXuat = scanner.nextLine();
        System.out.print("Nhập tên phương tiện: ");
        tenPhuongTien = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        namSanXuat = scanner.nextInt();
        System.out.print("Nhập vận tốc tối đa: ");
        vanTocToiDa = scanner.nextDouble();
    }

    // Phương thức xuất thông tin phương tiện giao thông
    public void xuatThongTin() {
        System.out.printf("Hãng sản xuất: %s\n", hangSanXuat);
        System.out.printf("Tên phương tiện: %s\n", tenPhuongTien);
        System.out.printf("Năm sản xuất: %d\n", namSanXuat);
        System.out.printf("Vận tốc tối đa: %.2f km/h\n", vanTocToiDa);
    }
}
