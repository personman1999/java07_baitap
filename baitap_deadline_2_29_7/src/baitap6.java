import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tiền gốc (P):");
        double P = scanner.nextDouble();

        System.out.println("Nhập lãi suất hàng năm (r):");
        double r = scanner.nextDouble();

        System.out.println("Nhập thời gian (t) (số năm):");
        double t = scanner.nextDouble();

        double A = P * (1 + r * t);

        System.out.println("Số tiền sau " + t + " năm là: " + A);
    }
}
