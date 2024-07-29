import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class baitap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        Set<Integer> mangKhongTrungLap = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            mangKhongTrungLap.add(mang[i]);
        }

        System.out.println("Mảng sau khi xóa các phần tử trùng lặp: " + mangKhongTrungLap);
    }
}
