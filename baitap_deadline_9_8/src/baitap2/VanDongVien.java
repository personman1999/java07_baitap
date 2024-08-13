package baitap2;

import java.util.Scanner;

public class VanDongVien {
    private String hoTen;
    private int tuoi;
    private String monThiDau;
    private float canNang;
    private float chieuCao;

    // Hàm khởi tạo không tham số
    public VanDongVien() {
        this.hoTen = "";
        this.tuoi = 0;
        this.monThiDau = "";
        this.canNang = 0.0f;
        this.chieuCao = 0.0f;
    }

    // Hàm khởi tạo có 5 tham số
    public VanDongVien(String hoTen, int tuoi, String monThiDau, float canNang, float chieuCao) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.monThiDau = monThiDau;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
    }

    // Phương thức nhập thông tin vận động viên
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập môn thi đấu: ");
        this.monThiDau = scanner.nextLine();
        System.out.print("Nhập cân nặng: ");
        this.canNang = scanner.nextFloat();
        System.out.print("Nhập chiều cao: ");
        this.chieuCao = scanner.nextFloat();
    }

    // Phương thức xuất thông tin vận động viên
    public void xuat() {
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Tuổi: " + this.tuoi);
        System.out.println("Môn thi đấu: " + this.monThiDau);
        System.out.println("Cân nặng: " + this.canNang);
        System.out.println("Chiều cao: " + this.chieuCao);
    }

    // Phương thức so sánh hai vận động viên
    public boolean lonHon(VanDongVien other) {
        if (this.chieuCao > other.chieuCao) {
            return true;
        } else if (this.chieuCao == other.chieuCao) {
            return this.canNang > other.canNang;
        } else {
            return false;
        }
    }

}
