package baitap4;

import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuDongCo;

    // Hàm khởi tạo không tham số
    public Oto() {}

    // Hàm khởi tạo có tham số
    public Oto(String hangSanXuat, String tenPhuongTien, int namSanXuat, double vanTocToiDa, int soChoNgoi, String kieuDongCo) {
        super(hangSanXuat, tenPhuongTien, namSanXuat, vanTocToiDa);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    // Phương thức nhập thông tin ô tô
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số chỗ ngồi: ");
        soChoNgoi = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Nhập kiểu động cơ: ");
        kieuDongCo = scanner.nextLine();
    }

    // Phương thức xuất thông tin ô tô
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.printf("Số chỗ ngồi: %d\n", soChoNgoi);
        System.out.printf("Kiểu động cơ: %s\n", kieuDongCo);
    }
}
