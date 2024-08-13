package baitap2;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo và nhập thông tin cho hai vận động viên
        VanDongVien vdv1 = new VanDongVien();
        VanDongVien vdv2 = new VanDongVien();

        System.out.println("Nhập thông tin cho vận động viên 1:");
        vdv1.nhap();

        System.out.println("Nhập thông tin cho vận động viên 2:");
        vdv2.nhap();

        // Xuất thông tin của cả hai vận động viên
        System.out.println("\nThông tin vận động viên 1:");
        vdv1.xuat();

        System.out.println("\nThông tin vận động viên 2:");
        vdv2.xuat();

        // So sánh hai vận động viên
        if (vdv1.lonHon(vdv2)) {
            System.out.println("\nVận động viên 1 lớn hơn vận động viên 2.");
        } else if (vdv2.lonHon(vdv1)) {
            System.out.println("\nVận động viên 2 lớn hơn vận động viên 1.");
        } else {
            System.out.println("\nHai vận động viên bằng nhau về chiều cao và cân nặng.");
        }
    }
}
