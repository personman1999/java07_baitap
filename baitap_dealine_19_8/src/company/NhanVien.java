package company;

public abstract class NhanVien {
    private int maSo;
    private String hoTen;
    private String soDienThoai;
    private int soNgayLamViec;
    private double luongMotNgay;

    public NhanVien(int maSo, String hoTen, String soDienThoai, int soNgayLamViec, double luongMotNgay) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNgayLamViec = soNgayLamViec;
        this.luongMotNgay = luongMotNgay;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public double getLuongMotNgay() {
        return luongMotNgay;
    }

    public abstract double tinhLuongThang();

    @Override
    public String toString() {
        return "Ma so: " + maSo + ", Ho ten: " + hoTen + ", So dien thoai: " + soDienThoai +
                ", So ngay lam viec: " + soNgayLamViec + ", Luong mot ngay: " + luongMotNgay;
    }
}