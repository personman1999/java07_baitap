import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        int soAm = 0, soDuong = 0, soKhong = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] < 0) {
                soAm++;
            } else if (mang[i] > 0) {
                soDuong++;
            } else {
                soKhong++;
            }
        }

        System.out.println("Số lượng số âm: " + soAm);
        System.out.println("Số lượng số dương: " + soDuong);
        System.out.println("Số lượng số không: " + soKhong);
    }
}
