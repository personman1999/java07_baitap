import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập số n: ");
//        int n = scanner.nextInt();
//
//        int tong = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                tong += i;
//            }
//        }
//
//        System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + tong);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();

        int tong = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                tong += i;
            }
            i++;
        }

        System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + tong);
    }
}
