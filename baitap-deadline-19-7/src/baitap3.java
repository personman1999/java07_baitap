import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Nhập số lẻ nguyên dương n: ");
             n = scanner.nextInt();
            if (n > 0 && n % 2 != 0) {
                break;
            } else {
                System.out.println("Số nhập vào phải là số lẻ nguyên dương lớn hơn 0. Vui lòng nhập lại.");
            }
        }
        int tong = 0;
        for (int i = 1; i < n; i += 2) {
            tong += i;
        }
        System.out.println("Tổng các số lẻ nhỏ hơn " + n + " là: " + tong);
    }
}
