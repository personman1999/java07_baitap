import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập số nguyên dương n ( 0->n ): ");
        int n = scanner.nextInt();
        int tong = 0;
        if (n < 0) {
            System.out.println("n phải là số nguyên dương");
        } else {
            for (int i = 0; i <= n; i+=2) {

                tong += i;
            }
            System.out.println("tổng cảu các số chẵn từ 0 -> n là: " + tong);
        }


    }
}
