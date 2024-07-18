import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh hình vuông: ");
        double a = scanner.nextDouble();
        System.out.println("Bạn muốn tính gì?");
        System.out.println("1. Diện tích");
        System.out.println("2. Chu vi");
        System.out.println("Nhập lựa chọn của bạn (1 hoặc 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                tinhDienTich(a);
                break;
            case 2:
                tinhChuVi(a);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn 1 hoặc 2.");
                break;
        }
    }

    public static void tinhDienTich(double a){
        double dienTich = Math.pow(a,2);
        System.out.println("diện tích của hình vuông là: " + dienTich);
    }

    public static void tinhChuVi(double a){
        double chuVi = a * 4;
        System.out.println("chu vi của hình vuông là: "+ chuVi);
    }
}
