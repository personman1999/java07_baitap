package baitap1;

public class Main {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh();
        hocSinh.inThongTinHocSinh();
        hocSinh.tinhDiemTrungBinh();
        hocSinh.xuatThongTin();


        XeHoi xeHoi = new XeHoi();
        xeHoi.nhapThongTinXe();
        xeHoi.xuatThongTinXe();


        TroChoi troChoi = new TroChoi();
        troChoi.hienThiMenu();
    }
}
