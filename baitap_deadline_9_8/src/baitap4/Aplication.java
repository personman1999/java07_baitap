package baitap4;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho một phương tiện giao thông
        System.out.println("Nhập thông tin cho một phương tiện giao thông:");
        PhuongTienGiaoThong ptgt = new PhuongTienGiaoThong();
        ptgt.nhapThongTin();
        System.out.println("\nThông tin phương tiện giao thông:");
        ptgt.xuatThongTin();

        // Nhập thông tin cho n đối tượng ô tô
        System.out.print("\nNhập số lượng ô tô: ");
        int n = scanner.nextInt();
        Oto[] danhSachOto = new Oto[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cho ô tô thứ " + (i + 1) + ":");
            danhSachOto[i] = new Oto();
            danhSachOto[i].nhapThongTin();
        }

        // Xuất thông tin danh sách ô tô
        System.out.println("\nDanh sách các ô tô đã nhập:");
        for (int i = 0; i < n; i++) {
            System.out.printf("\nThông tin ô tô thứ %d:\n", i + 1);
            danhSachOto[i].xuatThongTin();
        }

        // In ra các đối tượng ô tô có cùng vận tốc
        System.out.print("\nNhập vận tốc cần tìm: ");
        double vanTocCanTim = scanner.nextDouble();

        System.out.println("\nCác ô tô có vận tốc " + vanTocCanTim + " km/h:");
        boolean found = false;
        for (Oto oto : danhSachOto) {
            if (oto.vanTocToiDa == vanTocCanTim) {
                oto.xuatThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có ô tô nào có vận tốc này.");
        }
    }
}
