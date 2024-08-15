package company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CongTy {
    private String tenCongTy;
    private String maSoThue;
    private double doanhThuThang;
    private ArrayList<NhanVien> danhSachNV;

    public CongTy(String tenCongTy, String maSoThue, double doanhThuThang) {
        this.tenCongTy = tenCongTy;
        this.maSoThue = maSoThue;
        this.doanhThuThang = doanhThuThang;
        this.danhSachNV = new ArrayList<>();
    }

    public void themNhanVien(NhanVien nv) {
        danhSachNV.add(nv);
    }

    public void xoaNhanVien(int maSo) {
        NhanVien nhanVien = timNhanVien(maSo);

        if (nhanVien != null) {
            if (nhanVien instanceof TruongPhong) {
                TruongPhong truongPhong = (TruongPhong) nhanVien;
                for (NhanVienThuong nvThuong : truongPhong.getDanhSachNhanVienDQ()) {
                    nvThuong.setTruongPhongHienTai(null);
                }
            }

            danhSachNV.remove(nhanVien);
            System.out.println("Nhan vien da duoc xoa.");
        } else {
            System.out.println("Khong tim thay nhan vien voi ma so nay.");
        }
    }

    public void xoaNhanVienKhoiTruongPhong(int maSoNV) {
        NhanVien nv = timNhanVien(maSoNV);
        if (nv instanceof NhanVienThuong) {
            NhanVienThuong nvThuong = (NhanVienThuong) nv;
            TruongPhong tp = nvThuong.getTruongPhongHienTai();

            if (tp != null) {
                tp.xoaNhanVienDQ(nvThuong);
                System.out.println("Nhan vien da duoc loai bo khoi danh sach nhan vien duoi quyen cua truong phong.");
            } else {
                System.out.println("Nhan vien khong co truong phong.");
            }
        } else {
            System.out.println("Ma so nhan vien khong phai la nhan vien thuong.");
        }
    }


    public NhanVien timNhanVien(int maSo) {
        for (NhanVien nv : danhSachNV) {
            if (nv.getMaSo() == maSo) {
                return nv;
            }
        }
        return null;
    }

    public void xuatThongTin() {
        for (NhanVien nv : danhSachNV) {
            if (nv instanceof GiamDoc) {
                GiamDoc gd = (GiamDoc) nv;
                System.out.printf("Giam doc - Ma so: %d - Ho ten: %s - So dien thoai: %s - Luong mot ngay: %.2f - So ngay lam viec: %s - Co phan: %.2f%%, Luong thang: %.2f\n",
                        gd.getMaSo(), gd.getHoTen(), gd.getSoDienThoai(), gd.getLuongMotNgay(),gd.getSoNgayLamViec(), gd.getCoPhan(), gd.tinhLuongThang());
            } else if (nv instanceof TruongPhong) {
                TruongPhong tp = (TruongPhong) nv;
                System.out.printf("Truong phong - Ma so: %d - Ho ten: %s - So dien thoai: %s - Luong mot ngay: %.2f - So ngay lam viec: %s - Luong thang: %.2f\n",
                        tp.getMaSo(), tp.getHoTen(), tp.getSoDienThoai(), tp.getLuongMotNgay(),tp.getSoNgayLamViec(), tp.tinhLuongThang());
            } else {
                System.out.printf("Nhan vien - Ma so: %d - Ho ten: %s - So dien thoai: %s - Luong mot ngay: %.2f - So ngay lam viec: %s - Luong thang: %.2f\n",
                        nv.getMaSo(), nv.getHoTen(), nv.getSoDienThoai(), nv.getLuongMotNgay(), nv.getSoNgayLamViec(), nv.tinhLuongThang());
            }
        }
    }



    public double tinhTongLuongThang() {
        double tongLuong = 0;
        for (NhanVien nv : danhSachNV) {
            tongLuong += nv.tinhLuongThang();
        }
        return tongLuong;
    }

    public NhanVienThuong timNhanVienThuongLuongCaoNhat() {
        NhanVienThuong nvLuongCaoNhat = null;
        for (NhanVien nv : danhSachNV) {
            if (nv instanceof NhanVienThuong) {
                if (nvLuongCaoNhat == null || nv.tinhLuongThang() > nvLuongCaoNhat.tinhLuongThang()) {
                    nvLuongCaoNhat = (NhanVienThuong) nv;
                }
            }
        }
        return nvLuongCaoNhat;
    }

    public TruongPhong timTruongPhongCoNhieuNhanVienNhat() {
        TruongPhong tpMax = null;
        int maxSoNhanVien = 0;

        for (NhanVien nv : danhSachNV) {
            if (nv instanceof TruongPhong) {
                TruongPhong tp = (TruongPhong) nv;
                int soNhanVien = tp.getDanhSachNhanVienDQ().size();
                if (soNhanVien > maxSoNhanVien) {
                    maxSoNhanVien = soNhanVien;
                    tpMax = tp;
                }
            }
        }

        return tpMax;
    }


    public void sapXepNhanVienTheoTenCuoi() {
        Collections.sort(danhSachNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                char lastChar1 = nv1.getHoTen().charAt(nv1.getHoTen().length() - 1);
                char lastChar2 = nv2.getHoTen().charAt(nv2.getHoTen().length() - 1);
                return Character.compare(lastChar1, lastChar2);
            }
        });
    }


    public void sapXepNhanVienTheoLuongGiamDan() {
        Collections.sort(danhSachNV, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return Double.compare(nv2.tinhLuongThang(), nv1.tinhLuongThang());
            }
        });
    }

    public GiamDoc timGiamDocCoCoPhanNhieuNhat() {
        GiamDoc gdMax = null;
        for (NhanVien nv : danhSachNV) {
            if (nv instanceof GiamDoc) {
                GiamDoc gd = (GiamDoc) nv;
                if (gdMax == null || gd.getCoPhan() > gdMax.getCoPhan()) {
                    gdMax = gd;
                }
            }
        }
        return gdMax;
    }

    public void tinhVaXuatThuNhapGiamDoc() {
        double tongLuongThang = tinhTongLuongThang();
        double loiNhuanCongTy = doanhThuThang - tongLuongThang;

        for (NhanVien nv : danhSachNV) {
            if (nv instanceof GiamDoc) {
                GiamDoc gd = (GiamDoc) nv;
                double thuNhap = gd.tinhThuNhap(loiNhuanCongTy);
                System.out.printf("Giam doc: %s, Tong thu nhap: %.2f\n", gd.getHoTen(), thuNhap);
            }
        }
    }

    public ArrayList<NhanVien> getDanhSachNV() {
        return danhSachNV;
    }

    public void setDanhSachNV(ArrayList<NhanVien> danhSachNV) {
        this.danhSachNV = danhSachNV;
    }
}
