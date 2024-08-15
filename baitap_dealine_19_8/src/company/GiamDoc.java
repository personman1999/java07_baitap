package company;

public class GiamDoc extends NhanVien {
    private double coPhan;

    public GiamDoc(int maSo, String hoTen, String soDienThoai, int soNgayLamViec, double luongMotNgay, double coPhan) {
        super(maSo, hoTen, soDienThoai, soNgayLamViec, luongMotNgay);
        this.coPhan = coPhan;
    }

    public double getCoPhan() {
        return coPhan;
    }

//    public void setCoPhan(double coPhan) {
//        this.coPhan = coPhan;
//    }
    public double tinhThuNhap(double loiNhuanCongTy) {
        return tinhLuongThang() + (coPhan * loiNhuanCongTy);
    }

    @Override
    public double tinhLuongThang() {
        return getLuongMotNgay() * getSoNgayLamViec() + coPhan;
    }
}