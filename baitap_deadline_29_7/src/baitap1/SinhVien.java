package baitap1;

import java.util.Scanner;

public class SinhVien {
    private String ten;
    private String maSV;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public SinhVien(String ten, String maSV, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.maSV = maSV;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    public String xepLoai(double diemTB) {
        if (diemTB >= 9) {
            return "Xuất Sắc";
        } else if (diemTB >= 8) {
            return "Giỏi";
        } else if (diemTB >= 7) {
            return "Khá";
        } else if (diemTB >= 6) {
            return "Trung Bình";
        } else if (diemTB >= 5) {
            return "Yếu";
        } else {
            return "Kém";
        }
    }

    public void hienThiThongTin() {
        double diemTB = tinhDiemTrungBinh();
        System.out.println("Tên: " + ten);
        System.out.println("Mã SV: " + maSV);
        System.out.println("Điểm Toán: " + diemToan);
        System.out.println("Điểm Lý: " + diemLy);
        System.out.println("Điểm Hóa: " + diemHoa);
        System.out.println("Điểm Trung Bình: " + diemTB);
        System.out.println("Xếp Loại: " + xepLoai(diemTB));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên: ");
        String ten = scanner.nextLine();

        System.out.print("Nhập mã sinh viên: ");
        String maSV = scanner.nextLine();

        System.out.print("Nhập điểm Toán: ");
        double diemToan = scanner.nextDouble();

        System.out.print("Nhập điểm Lý: ");
        double diemLy = scanner.nextDouble();

        System.out.print("Nhập điểm Hóa: ");
        double diemHoa = scanner.nextDouble();

        SinhVien sinhVien = new SinhVien(ten, maSV, diemToan, diemLy, diemHoa);
        sinhVien.hienThiThongTin();
    }
}
