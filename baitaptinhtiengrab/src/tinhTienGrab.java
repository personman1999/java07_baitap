import java.util.Scanner;

public class tinhTienGrab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hiển thị tùy chọn loại xe
        System.out.println("Chọn loại xe(1: GrabCar, 2: GrabSUV, 3: GrabBlack): ");
        int loaiXe = scanner.nextInt();
        // Nhập số km đi được và thời gian chờ
        System.out.println("Nhập số km đi được:");
        double km = scanner.nextDouble();

        System.out.println("Nhập thời gian chờ (phút):");
        double thoiGianCho = scanner.nextDouble();

        // Tính toán chi phí
        double tongTien = tinhTienTheoBangGia(loaiXe, km, thoiGianCho);

        // In hóa đơn chi tiết
        printInvoice(loaiXe, km, thoiGianCho, tongTien);

        scanner.close();
    }

    public static double tinhTienTheoBangGia(int loaiXe, double km, double thoiGianCho) {
        double fare = 0;
        double phiCho = 0;

        // Bảng giá theo từng loại xe
        if (loaiXe == 1) { // GrabCar
            fare = tinhTienTheoKm(km, 8000, 7500, 7000);
            phiCho = (thoiGianCho / 3) * 2000;
        } else if (loaiXe == 2) { // Grab SUV
            fare = tinhTienTheoKm(km, 9000, 8500, 8000);
            phiCho = (thoiGianCho / 3) * 3000;
        } else if (loaiXe == 3) { // GrabBlack
            fare = tinhTienTheoKm(km, 10000, 9500, 9000);
            phiCho = (thoiGianCho / 3) * 3500;
        }

        return fare + phiCho;
    }

    public static double tinhTienTheoKm(double km, double kmDauTien, double kmTu1Den19, double kmSau19) {
        if (km <= 1) {
            return km * kmDauTien;
        } else if (km <= 19) {
            return kmDauTien + (km - 1) * kmTu1Den19;
        } else {
            return kmDauTien + 18 * kmTu1Den19 + (km - 19) * kmSau19;
        }
    }

    public static void printInvoice(int loaiXe, double km, double thoiGianCho, double tongTien) {
        String tenLoaiXe = "";
        if (loaiXe == 1) {
            tenLoaiXe = "GrabCar";
        } else if (loaiXe == 2) {
            tenLoaiXe = "Grab SUV";
        } else if (loaiXe == 3) {
            tenLoaiXe = "GrabBlack";
        }

        System.out.println("\n--- Hóa đơn chi tiết ---");
        System.out.println("Loại xe: " + tenLoaiXe);
        System.out.println("Số km: " + km);
        System.out.println("Thời gian chờ: " + thoiGianCho + " phút");
        System.out.println("Tổng tiền: " + tongTien + " VND");
    }
}
