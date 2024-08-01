package baitap2;

import java.util.Scanner;

class ThietBiDien {
    private String congSuat;
    private String chucNang;

    //Phương thức hiển thị thông tin về thiết bị điện
    public void hienThiThongTin() {
        System.out.println("Công suất: " + congSuat);
        System.out.println("Chức năng: " + chucNang);
    }

    //Phương thức nhập thông tin
    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập công suất: ");
        congSuat = scanner.nextLine();
        System.out.print("Nhập chức năng: ");
        chucNang = scanner.nextLine();
    }
}

//Lớp con cho điều hòa
class DieuHoa extends ThietBiDien {
    public DieuHoa() {
        super();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Thông tin điều hòa:");
        super.hienThiThongTin();
    }
}

// Lớp con cho máy sấy
class MaySay extends ThietBiDien {
    public MaySay() {
        super();
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Thông tin máy sấy:");
        super.hienThiThongTin();
    }
}
