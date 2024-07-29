package baitap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySinhVien {
    List<SinhVien1> danhSachSinhVien = new ArrayList<>();

    void themSinhVien(SinhVien1 sv) {
        danhSachSinhVien.add(sv);
    }

    void inDanhSach() {
        System.out.println("Danh sách sinh viên:");
        for (SinhVien1 sv : danhSachSinhVien) {
            sv.inThongTin();
        }
    }

    void inSinhVienCoDTBCaoNhat() {
        SinhVien1 maxSV = null;
        for (SinhVien1 sv : danhSachSinhVien) {
            if (maxSV == null || sv.tinhDiemTrungBinh() > maxSV.tinhDiemTrungBinh()) {
                maxSV = sv;
            }
        }
        if (maxSV != null) {
            System.out.println("Sinh viên có ĐTB cao nhất:");
            maxSV.inThongTin();
        }
    }

    void inSinhVienYeu() {
        System.out.println("Danh sách sinh viên yếu:");
        for (SinhVien1 sv : danhSachSinhVien) {
            if (sv.xepLoai().equals("Yếu")) {
                sv.inThongTin();
            }
        }
    }

    void timSinhVienTheoTen(String ten) {
        System.out.println("Kết quả tìm kiếm sinh viên theo tên \"" + ten + "\":");
        boolean found = false;
        for (SinhVien1 sv : danhSachSinhVien) {
            if (sv.getTen().toLowerCase().contains(ten.toLowerCase())) {
                sv.inThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào có tên chứa \"" + ten + "\".");
        }
    }

    void timSinhVienTheoMa(String maSV) {
        System.out.println("Kết quả tìm kiếm sinh viên theo mã \"" + maSV + "\":");
        boolean found = false;
        for (SinhVien1 sv : danhSachSinhVien) {
            if (sv.getMaSV().equalsIgnoreCase(maSV)) {
                sv.inThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào có mã \"" + maSV + "\".");
        }
    }

    void xoaSinhVienTheoMa(String maSV) {
        boolean removed = danhSachSinhVien.removeIf(sv -> sv.getMaSV().equalsIgnoreCase(maSV));
        if (removed) {
            System.out.println("Đã xóa sinh viên có mã: " + maSV);
        } else {
            System.out.println("Không tìm thấy sinh viên nào có mã \"" + maSV + "\" để xóa.");
        }
    }

    void khoiTaoDuLieuGia() {
        themSinhVien(new SinhVien1("Nguyen Van A", "SV001", 8.0, 7.5, 9.0));
        themSinhVien(new SinhVien1("Le Thi B", "SV002", 6.0, 5.5, 7.0));
        themSinhVien(new SinhVien1("Tran Van C", "SV003", 9.0, 9.5, 10.0));
        themSinhVien(new SinhVien1("Pham Thi D", "SV004", 4.0, 5.0, 5.5));
    }

    void nhapThongTinSinhVien(Scanner scanner) {
        System.out.println("Nhập tên sinh viên:");
        String ten = scanner.nextLine();
        System.out.println("Nhập mã sinh viên:");
        String maSV = scanner.nextLine();
        System.out.println("Nhập điểm Toán:");
        double diemToan = scanner.nextDouble();
        System.out.println("Nhập điểm Lý:");
        double diemLy = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa:");
        double diemHoa = scanner.nextDouble();
        scanner.nextLine();

        SinhVien1 sv = new SinhVien1(ten, maSV, diemToan, diemLy, diemHoa);
        themSinhVien(sv);
        System.out.println("Thông tin sinh viên mới nhập:");
        sv.inThongTin();
    }

    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        Scanner scanner = new Scanner(System.in);

        //khởi tạo dữ liệu giả
        qlsv.khoiTaoDuLieuGia();

        int luaChon;
        do {
            System.out.println("----- QUẢN LÝ SINH VIÊN -----");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. In sinh viên có ĐTB cao nhất");
            System.out.println("4. In sinh viên yếu");
            System.out.println("5. Tìm sinh viên theo tên");
            System.out.println("6. Tìm sinh viên theo mã");
            System.out.println("7. Xóa sinh viên theo mã");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    qlsv.nhapThongTinSinhVien(scanner);
                    break;
                case 2:
                    qlsv.inDanhSach();
                    break;
                case 3:
                    qlsv.inSinhVienCoDTBCaoNhat();
                    break;
                case 4:
                    qlsv.inSinhVienYeu();
                    break;
                case 5:
                    System.out.println("Nhập tên sinh viên cần tìm:");
                    String ten = scanner.nextLine();
                    qlsv.timSinhVienTheoTen(ten);
                    break;
                case 6:
                    System.out.println("Nhập mã sinh viên cần tìm:");
                    String maSV = scanner.nextLine();
                    qlsv.timSinhVienTheoMa(maSV);
                    break;
                case 7:
                    System.out.println("Nhập mã sinh viên cần xóa:");
                    String maSVXoa = scanner.nextLine();
                    qlsv.xoaSinhVienTheoMa(maSVXoa);
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 0);

        scanner.close();
    }
}