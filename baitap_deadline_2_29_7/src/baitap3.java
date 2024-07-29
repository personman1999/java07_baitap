import java.util.Scanner;
import java.util.ArrayList;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        ArrayList<Integer> mang = new ArrayList<>();

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            mang.add(scanner.nextInt());
        }

        System.out.println("Nhập giá trị phần tử cần xóa:");
        int giaTri = scanner.nextInt();

        while (mang.contains(giaTri)) {
            mang.remove((Integer) giaTri);
        }

        System.out.println("Mảng sau khi xóa phần tử " + giaTri + " là: " + mang);
    }
}
