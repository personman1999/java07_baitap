package baitap1;

import java.util.Scanner;

public class XeHoi {
    String hangSanXuat;
    int namSanXuat;
    String mauSac;

    void nhapThongTinXe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hãng xe: ");
        this.hangSanXuat = scanner.nextLine();
        System.out.println("Nhập màu xe: ");
        this.mauSac = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        this.namSanXuat = scanner.nextInt();

    }

    void xuatThongTinXe(){
        System.out.println("Hãng xe là: " + this.hangSanXuat);
        System.out.println("Năm sản xuất xe là: " + this.namSanXuat);
        System.out.println("Màu của xe là: " + this.mauSac);
    }
}
