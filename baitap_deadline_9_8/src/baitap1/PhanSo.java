package baitap1;

import java.util.Scanner;

class PhanSo {
    private int tuSo;
    private int mauSo;

    // Hàm khởi tạo không tham số
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tu, int mau) {

    }

    // Phương thức nhập phân số
    public void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        this.tuSo = scanner.nextInt();
        System.out.print("Nhập mẫu số: ");
        this.mauSo = scanner.nextInt();
        if (this.mauSo == 0) {
            System.out.println("Mẫu số không thể bằng 0. Đã gán mẫu số là 1.");
            this.mauSo = 1;
        }
    }

    // Phương thức xuất phân số
    public void xuatPhanSo() {
        System.out.println(this.tuSo + "/" + this.mauSo);
    }

    // Phương thức cộng hai phân số
    public PhanSo cong(PhanSo p) {
        int tu = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
        int mau = this.mauSo * p.mauSo;
        return new PhanSo(tu, mau);
    }

    // Phương thức trừ hai phân số
    public PhanSo tru(PhanSo p) {
        int tu = this.tuSo * p.mauSo - p.tuSo * this.mauSo;
        int mau = this.mauSo * p.mauSo;
        return new PhanSo(tu, mau);
    }

    // Phương thức nhân hai phân số
    public PhanSo nhan(PhanSo p) {
        int tu = this.tuSo * p.tuSo;
        int mau = this.mauSo * p.mauSo;
        return new PhanSo(tu, mau);
    }

    // Phương thức chia hai phân số
    public PhanSo chia(PhanSo p) {
        int tu = this.tuSo * p.mauSo;
        int mau = this.mauSo * p.tuSo;
        return new PhanSo(tu, mau);
    }
}