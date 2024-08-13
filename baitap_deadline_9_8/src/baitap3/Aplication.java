package baitap3;

public class Aplication {
    public static void main(String[] args) {
        // Nhập thông tin cho nhân viên văn phòng
        System.out.println("Nhập thông tin cho nhân viên văn phòng:");
        NhanVienVanPhong nvvp = new NhanVienVanPhong("", "", 0);
        nvvp.nhapThongTin();
        nvvp.tinhLuong();

        // Nhập thông tin cho nhân viên sản xuất
        System.out.println("\nNhập thông tin cho nhân viên sản xuất:");
        NhanVienSanXuat nvsx = new NhanVienSanXuat("", "", 0);
        nvsx.nhapThongTin();
        nvsx.tinhLuong();

        // Xuất thông tin và lương của nhân viên văn phòng
        System.out.println("\nThông tin nhân viên văn phòng:\n");
        nvvp.xuatThongTin();

        // Xuất thông tin và lương của nhân viên sản xuất
        System.out.println("\nThông tin nhân viên sản xuất:\n");
        nvsx.xuatThongTin();
    }
}
