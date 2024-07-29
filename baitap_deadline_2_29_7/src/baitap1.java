import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        int tongLe = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 != 0) {
                tongLe += mang[i];
            }
        }

        System.out.println("Tổng các phần tử lẻ trong mảng là: " + tongLe);
    }
}
