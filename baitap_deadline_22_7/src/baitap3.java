import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập số thứ 1: ");
        double so1 = scanner.nextDouble();
        System.out.println("nhập số thứ 2: ");
        double so2 = scanner.nextDouble();
        System.out.println("nhập số thứ 3: ");
        double so3 = scanner.nextDouble();
        tinhTong(so1,so2,so3);

    }

    public static void tinhTong(double so1,double so2,double so3){
        double tong = 0;
        tong = so1 + so2+ so3;
        System.out.println("tổng 3 số vừa nhập là: " + tong);

    }
}
