package baitap1;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo();

        System.out.println("Nhập phân số thứ nhất:");
        p1.nhapPhanSo();

        System.out.println("Nhập phân số thứ hai:");
        p2.nhapPhanSo();

        PhanSo tong = p1.cong(p2);
        PhanSo hieu = p1.tru(p2);
        PhanSo tich = p1.nhan(p2);
        PhanSo thuong = p1.chia(p2);

        System.out.print("Tổng: ");
        tong.xuatPhanSo();

        System.out.print("Hiệu: ");
        hieu.xuatPhanSo();

        System.out.print("Tích: ");
        tich.xuatPhanSo();

        System.out.print("Thương: ");
        thuong.xuatPhanSo();
    }
}
