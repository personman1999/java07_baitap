package baitap2;

class SinhVien1 {
    String ten;
    String maSV;
    double diemToan;
    double diemLy;
    double diemHoa;

    public SinhVien1(String ten, String maSV, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.maSV = maSV;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    public String xepLoai() {
        double dtb = tinhDiemTrungBinh();
        if (dtb >= 9) {
            return "Xuất Sắc";
        } else if (dtb >= 8) {
            return "Giỏi";
        } else if (dtb >= 7) {
            return "Khá";
        } else if (dtb >= 6) {
            return "Trung Bình";
        } else if (dtb >= 5) {
            return "Yếu";
        } else {
            return "Kém";
        }
    }

    public String getTen() {
        return ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public void inThongTin() {
        System.out.printf("Tên: %-15s Mã SV: %-10s Điểm TB: %.2f Xếp loại: %-10s%n", ten, maSV, tinhDiemTrungBinh(), xepLoai());
    }
}