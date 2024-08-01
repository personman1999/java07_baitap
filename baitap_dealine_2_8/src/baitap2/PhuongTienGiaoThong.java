package baitap2;

import java.util.Scanner;

class PhuongTienGiaoThong {
    private String hangSanXuat;
    private String mauSac;
    private int namSanXuat;

    // Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("Màu sắc: " + mauSac);
        System.out.println("Năm sản xuất: " + namSanXuat);
    }

    // Phương thức nhập thông tin
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập hãng sản xuất: ");
        hangSanXuat = scanner.nextLine();
        System.out.print("Nhập màu sắc: ");
        mauSac = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        namSanXuat = scanner.nextInt();
        scanner.nextLine();
    }
}

// Lớp con cho xe hơi
class XeHoi extends PhuongTienGiaoThong {
    @Override
    public void hienThiThongTin() {
        System.out.println("Thông tin xe hơi:");
        super.hienThiThongTin();
    }
}

// Lớp con cho xe máy
class XeMay extends PhuongTienGiaoThong {
    @Override
    public void hienThiThongTin() {
        System.out.println("Thông tin xe máy:");
        super.hienThiThongTin();
    }
}
