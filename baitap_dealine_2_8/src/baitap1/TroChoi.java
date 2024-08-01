package baitap1;

import java.util.Scanner;

public class TroChoi {
    String tenTroChoi;
    int soLuotChoi;
    boolean daNhapThongTin = false;

    //Phương thức để nhập thông tin trò chơi
    void nhapThongTinTroChoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên trò chơi: ");
        this.tenTroChoi = scanner.nextLine();
        System.out.println("Nhập số lượt chơi: ");
        this.soLuotChoi = scanner.nextInt();
        scanner.nextLine();
        daNhapThongTin = true;
    }

    //Phương thức để bắt đầu trò chơi
    void batDauTroChoi() {
        if (daNhapThongTin) {
            System.out.println("Bắt đầu trò chơi: " + this.tenTroChoi);
        } else {
            System.out.println("Vui lòng nhập thông tin trò chơi trước.");
        }
    }

    //Phương thức để kết thúc trò chơi
    void ketThucTroChoi() {
        if (daNhapThongTin) {
            System.out.println("Kết thúc trò chơi: " + this.tenTroChoi);
            System.out.println("Số lượt chơi đã thực hiện: " + this.soLuotChoi);
        } else {
            System.out.println("Vui lòng nhập thông tin trò chơi trước.");
        }
    }

    //Phương thức để hiển thị menu và xử lý lựa chọn của người dùng
    void hienThiMenu() {
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("\nChọn một tùy chọn:");
            if (!daNhapThongTin) {
                System.out.println("1. Nhập thông tin trò chơi");
            }
            if (daNhapThongTin) {
                System.out.println("2. Bắt đầu trò chơi");
                System.out.println("3. Kết thúc trò chơi");
            }
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    if (!daNhapThongTin) {
                        nhapThongTinTroChoi();
                    } else {
                        System.out.println("Thông tin trò chơi đã được nhập.");
                    }
                    break;
                case 2:
                    if (daNhapThongTin) {
                        batDauTroChoi();
                    } else {
                        System.out.println("Vui lòng nhập thông tin trò chơi trước.");
                    }
                    break;
                case 3:
                    if (daNhapThongTin) {
                        ketThucTroChoi();
                        return;
                    } else {
                        System.out.println("Vui lòng nhập thông tin trò chơi trước.");
                    }
                    break;
                case 4:
                    System.out.println("Thoát khỏi chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        } while (luaChon != 4);
    }
}