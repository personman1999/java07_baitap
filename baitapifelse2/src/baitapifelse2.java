import java.util.Scanner;

public class baitapifelse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sản phẩm
        System.out.println("Mời nhập tên sản phẩm: ");
        String tenSanPham = scanner.nextLine();

        System.out.println("Mời nhập số lượng: ");
        int soLuong = scanner.nextInt();

        System.out.println("Mời nhập đơn giá (VND): ");
        double donGia = scanner.nextDouble();

        // Tính tổng tiền phải trả
        double tongTien = soLuong * donGia;
        double giamGia = 0.0;

        if (soLuong >= 50 && soLuong < 100) {
            giamGia = 0.08;
        } else if (soLuong >= 100) {
            giamGia = 0.12;
        }

        double tienGiam = tongTien * giamGia;
        double tienPhaiTra = tongTien - tienGiam;

        // Xuất kết quả
        System.out.printf("Tên sản phẩm: %s%n", tenSanPham);
        System.out.printf("Số lượng: %d%n", soLuong);
        System.out.printf("Đơn giá: %.2f%n", donGia);
        System.out.printf("Tổng tiền trước khi giảm: %.2f%n", tongTien);
        System.out.printf("Giảm giá: %.0f%%%n", giamGia * 100);
        System.out.printf("Tiền giảm: %.2f%n", tienGiam);
        System.out.printf("Tổng tiền phải trả: %.2f%n", tienPhaiTra);


    }
}
