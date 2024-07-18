import java.util.Scanner;
import java.util.Random;

public class baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Bạn muốn nhập mảng bằng tay hay tự động (1 - bằng tay, 2 - tự động): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Nhập mảng bằng tay
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }
        } else if (choice == 2) {
            // Nhập mảng tự động
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(100); // Sinh ngẫu nhiên các số từ 0 đến 99
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn 1 hoặc 2.");
            return;
        }

        // Hiển thị mảng vừa nhập
        System.out.println("Mảng vừa nhập là: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
