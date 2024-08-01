package baitap1;

import java.util.Scanner;

public class HocSinh {
    String ten;
    int tuoi;
    double diemToan;
    double diemLy;
    double diemHoa;
    double diemTB;

    void inThongTinHocSinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: " );
        this.ten = scanner.nextLine();
        System.out.println("Nhập Tuổi: ");
        this.tuoi = scanner.nextInt();
        System.out.println("Nhập điểm Toán: ");
        this.diemToan = scanner.nextDouble();
        System.out.println("Nhập điểm Lý: ");
        this.diemLy = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa: ");
        this.diemHoa = scanner.nextDouble();

    }

    void tinhDiemTrungBinh(){
        this.diemTB = (diemHoa + diemToan + diemLy)/3;
    }

    void xuatThongTin(){
        System.out.println("Tên học sinh là " + this.ten + " "+ tuoi + " tuổi"  );
        System.out.println("Điểm trung bình của "+ this.ten + " là " + diemTB);
    }
}
