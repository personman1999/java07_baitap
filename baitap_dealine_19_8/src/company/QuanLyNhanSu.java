package company;

import java.util.Scanner;

public class QuanLyNhanSu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CongTy congTy = null;

        while (true) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Nhap thong tin cong ty");
            System.out.println("2. Phan bo nhan vien vao truong phong");
            System.out.println("3. Them nhan vien");
            System.out.println("4. Xoa nhan vien");
            System.out.println("5. Loai bo nhan vien khoi danh sach nhan vien duoi quyen cua truong phong");
            System.out.println("6. Xuat thong tin toan bo nguoi trong cong ty");
            System.out.println("7. Tinh va xuat tong luong cho toan bo nhan vien cong ty");
            System.out.println("8. Tim nhan vien thuong co luong cao nhat");
            System.out.println("9. Tim truong phong co so luong nhan vien duoi quyen nhieu nhat");
            System.out.println("10. Sap xep nhan vien toan cong ty theo thu tu abc");
            System.out.println("11. Sap xep nhan vien toan cong ty theo thu tu luong giam dan");
            System.out.println("12. Tim giam doc co so luong co phan nhieu nhat");
            System.out.println("13. Tinh va xuat tong thu nhap cua tung giam doc");
            System.out.println("14. Thoat");
            System.out.print("Lua chon cua ban: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // 1: Nhập thông tin công ty
                    System.out.print("Nhap ten cong ty: ");
                    String tenCongTy = scanner.nextLine();
                    System.out.print("Nhap ma so thue: ");
                    String maSoThue = scanner.nextLine();
                    System.out.print("Nhap doanh thu thang: ");
                    double doanhThuThang = scanner.nextDouble();
                    scanner.nextLine();
                    congTy = new CongTy(tenCongTy, maSoThue, doanhThuThang);

                    //Data giám đốc
                    GiamDoc gd2 = new GiamDoc(2, "Tran Van B" , "0245581233", 30, 300, 0.04);
                    GiamDoc gd1 = new GiamDoc(1, "Tran Van A" , "0865451221", 28, 300, 0.05);
                    congTy.themNhanVien(gd1);
                    congTy.themNhanVien(gd2);

                    //Data trưởng phòng
                    TruongPhong tp2 = new TruongPhong(4, "Nguyen Van D", "0343532545", 30, 200);
                    TruongPhong tp = new TruongPhong(3, "Nguyen Van C", "0912345678", 20, 200);
                    congTy.themNhanVien(tp);
                    congTy.themNhanVien(tp2);

                    // Data nhân viên
                    NhanVienThuong nv4 = new NhanVienThuong(8, "Tran Van H", "02445556845",20 , 100);
                    NhanVienThuong nv1 = new NhanVienThuong(5, "Le Thi E", "0912345679", 22, 100);
                    NhanVienThuong nv3 = new NhanVienThuong(7, "Tran Van G", "0254558552", 28, 100);
                    NhanVienThuong nv2 = new NhanVienThuong(6, "Tran Van F", "0912345680", 25, 100);
                    congTy.themNhanVien(nv1);
                    congTy.themNhanVien(nv2);
                    congTy.themNhanVien(nv3);
                    congTy.themNhanVien(nv4);

                    // Nhân viên dưới quyền
                    tp.themNhanVienDQ(nv1);
                    tp.themNhanVienDQ(nv2);

                    System.out.println("Thong tin cong ty da duoc nhap va du lieu gia da duoc them.");
                    break;

                case 2:
                    if (congTy != null) {
                        // 2: Phân bổ nhân viên vào trưởng phòng
                        System.out.print("Nhap ma so truong phong: ");
                        int maSoTP = scanner.nextInt();
                        scanner.nextLine();
                        TruongPhong tp1 = (TruongPhong) congTy.timNhanVien(maSoTP);

                        if (tp1 != null) {
                            System.out.print("Nhap ma so nhan vien duoi quyen: ");
                            int maSoNV = scanner.nextInt();
                            scanner.nextLine();
                            NhanVien nv = congTy.timNhanVien(maSoNV);

                            if (nv != null && nv instanceof NhanVienThuong) {
                                NhanVienThuong nvThuong = (NhanVienThuong) nv;
                                if (nvThuong.getTruongPhongHienTai() == null) {
                                    tp1.themNhanVienDQ(nvThuong);
                                    nvThuong.setTruongPhongHienTai(tp1);
                                    System.out.println("Nhan vien da duoc phan bo vao truong phong.");
                                } else {
                                    System.out.println("Nhan vien da duoc phan bo vao truong phong khac.");
                                }
                            } else {
                                System.out.println("Khong tim thay nhan vien thuong voi ma so nay.");
                            }
                        } else {
                            System.out.println("Khong tim thay truong phong voi ma so nay.");
                        }
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;


                case 3:
                    if (congTy != null) {
                        // 3: Thêm nhân viên
                        System.out.print("Nhap ma so nhan vien: ");
                        int maSoNV = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nhap ho ten nhan vien: ");
                        String hoTenNV = scanner.nextLine();
                        System.out.print("Nhap so dien thoai: ");
                        String soDienThoaiNV = scanner.nextLine();
                        System.out.print("Nhap so ngay lam viec: ");
                        int soNgayLamViecNV = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nhap luong mot ngay: ");
                        double luongMotNgay = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println("Chon loai nhan vien:");
                        System.out.println("1. Truong phong");
                        System.out.println("2. Giam doc");
                        System.out.println("3. Nhan vien thuong");
                        System.out.print("Lua chon cua ban: ");
                        int loaiNhanVien = scanner.nextInt();
                        scanner.nextLine();

                        NhanVien nv = null;

                        switch (loaiNhanVien) {
                            case 1:
                                nv = new TruongPhong(maSoNV, hoTenNV, soDienThoaiNV, soNgayLamViecNV, luongMotNgay);
                                break;
                            case 2:
                                System.out.print("Nhap co phan cua giam doc: ");
                                double coPhan = scanner.nextDouble();
                                scanner.nextLine();
                                nv = new GiamDoc(maSoNV, hoTenNV, soDienThoaiNV, soNgayLamViecNV, luongMotNgay, coPhan);
                                break;
                            case 3:
                                nv = new NhanVienThuong(maSoNV, hoTenNV, soDienThoaiNV, soNgayLamViecNV, luongMotNgay);
                                break;
                            default:
                                System.out.println("Lua chon khong hop le.");
                                continue;
                        }

                        congTy.themNhanVien(nv);
                        System.out.println("Nhan vien da duoc them.");
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;

                case 4:
                    if (congTy != null) {
                        // 4: Xóa nhân sự
                        System.out.print("Nhap ma so nhan su can xoa: ");
                        int maSoXoa = scanner.nextInt();
                        scanner.nextLine();
                        congTy.xoaNhanVien(maSoXoa);
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;

                case 5:
                    if (congTy != null) {
                        // 5: Loại bỏ nhân viên dưới quyền trưởng phòng
                        System.out.print("Nhap ma so nhan vien de loai bo khoi truong phong: ");
                        int maSoNV = scanner.nextInt();
                        scanner.nextLine();
                        congTy.xoaNhanVienKhoiTruongPhong(maSoNV);
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;

                case 6:
                    if (congTy != null) {
                        // 6: Xuất thông tin toàn bộ người trong công ty
                        congTy.xuatThongTin();

                        System.out.println("\nThong tin chi tiet ve cac nhan vien thuoc truong phong:");
                        for (NhanVien nv : congTy.getDanhSachNV()) {
                            if (nv instanceof NhanVienThuong) {
                                NhanVienThuong nvThuong = (NhanVienThuong) nv;
                                TruongPhong tp3 = nvThuong.getTruongPhongHienTai();
                                if (tp3 != null) {
                                    System.out.printf("Nhan vien: %s (%d) thuoc truong phong: %s (%d)\n",
                                            nvThuong.getHoTen(), nvThuong.getMaSo(),
                                            tp3.getHoTen(), tp3.getMaSo());
                                } else {
                                    System.out.printf("Nhan vien: %s (%d) chua duoc phan vao truong phong nao.\n",
                                            nvThuong.getHoTen(), nvThuong.getMaSo());
                                }
                            }
                        }
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;


                case 7:
                    if (congTy != null) {
                        // 7: Tính và xuất tổng lương cho toàn bộ nhân viên công ty
                        double tongLuong = congTy.tinhTongLuongThang();
                        System.out.println("Tong luong thang cua toan bo cong ty: " + tongLuong);
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;

                case 8:
                    if (congTy != null) {
                        // 8: Tìm nhân viên thường có lương cao nhất
                        NhanVienThuong nvLuongCaoNhat = congTy.timNhanVienThuongLuongCaoNhat();

                        if (nvLuongCaoNhat != null) {
                            System.out.printf("Nhan vien thuong co luong cao nhat:\n" +
                                            "Ma so: %d\n" +
                                            "Ho ten: %s\n" +
                                            "So dien thoai: %s\n" +
                                            "So ngay lam viec: %d\n" +
                                            "Luong mot ngay: %.2f\n" +
                                            "Luong thang: %.2f\n",
                                    nvLuongCaoNhat.getMaSo(),
                                    nvLuongCaoNhat.getHoTen(),
                                    nvLuongCaoNhat.getSoDienThoai(),
                                    nvLuongCaoNhat.getSoNgayLamViec(),
                                    nvLuongCaoNhat.getLuongMotNgay(),
                                    nvLuongCaoNhat.tinhLuongThang());
                        } else {
                            System.out.println("Khong co nhan vien thuong nao trong cong ty.");
                        }
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;



                case 9:
                    if (congTy != null) {
                        // 9: Tìm truỏng phòng có nhiều nhân viên nhất
                        TruongPhong tpMax = congTy.timTruongPhongCoNhieuNhanVienNhat();
                        if (tpMax != null) {
                            System.out.println("Truong phong co nhieu nhan vien nhat: " + tpMax.getHoTen());
                            System.out.println("So luong nhan vien duoi quyen: " + tpMax.getDanhSachNhanVienDQ().size());
                        } else {
                            System.out.println("Khong co truong phong nao.");
                        }
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;

                case 10:
                    if (congTy != null) {
                        // 10: Sắp xếp nhân viên theo tên ABC
                        congTy.sapXepNhanVienTheoTenCuoi();
                        System.out.println("Nhan vien da duoc sap xep theo thu tu ky tu cuoi cua ten.");
                        congTy.xuatThongTin();
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;


                case 11:
                    if (congTy != null) {
                        // 11: Sắp xếp nhân viên theo mức lương giảm dần
                        congTy.sapXepNhanVienTheoLuongGiamDan();
                        System.out.println("Nhan vien da duoc sap xep theo thu tu luong giam dan.");
                        congTy.xuatThongTin();

                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;

                case 12:
                    if (congTy != null) {
                        // 12: Tìm giám  đốc có cổ phần nhiều nhất
                        GiamDoc gdMax = congTy.timGiamDocCoCoPhanNhieuNhat();
                        if (gdMax != null) {
                            System.out.println("Giam doc co so co phan nhieu nhat: " + gdMax);
                            System.out.println("So co phan: " + gdMax.getCoPhan() + "%");
                        } else {
                            System.out.println("Khong co giam doc nao.");
                        }
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;

                case 13:
                    if (congTy != null) {
                        // 13: Tinh và xất thu nập của giám đốc
                        congTy.tinhVaXuatThuNhapGiamDoc();
                    } else {
                        System.out.println("Chua nhap thong tin cong ty.");
                    }
                    break;

                case 14:
                    // 14: Thoát chuong trình
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");

            }
        }
    }
}
