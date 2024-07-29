import java.util.Scanner;

public class baitap10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        System.out.println("Nhập giá trị n:");
        int giaTriN = scanner.nextInt();

        int tongNguyenTo = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] < giaTriN && laSoNguyenTo(mang[i])) {
                tongNguyenTo += mang[i];
            }
        }

        System.out.println("Tổng các số nguyên tố nhỏ hơn " + giaTriN + " trong mảng là: " + tongNguyenTo);
    }

    public static boolean laSoNguyenTo(int so) {
        if (so <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (so % i == 0) {
                return false;
            }
        }
        return true;
    }
}
