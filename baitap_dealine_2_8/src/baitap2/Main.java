package baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho xe hơi
        XeHoi xeHoi = new XeHoi();
        System.out.println("Nhập thông tin cho xe hơi:");
        xeHoi.nhapThongTin(scanner);
        xeHoi.hienThiThongTin();

        // Nhập thông tin cho xe máy
        System.out.println("Nhập thông tin cho xe máy:");
        XeMay xeMay = new XeMay();
        xeMay.nhapThongTin(scanner);
        xeMay.hienThiThongTin();

        // Nhập thông tin cho điều hòa
        System.out.println("Nhập thông tin cho điều hòa:");
        DieuHoa dieuHoa = new DieuHoa();
        dieuHoa.nhapThongTin(scanner);
        dieuHoa.hienThiThongTin();

        // Nhập thông tin cho máy sấy
        System.out.println("Nhập thông tin cho máy sấy:");
        MaySay maySay = new MaySay();
        maySay.nhapThongTin(scanner);
        maySay.hienThiThongTin();

        scanner.close();
    }
}
