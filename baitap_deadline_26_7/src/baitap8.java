import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị các phần tử là số chẵn
        System.out.println("Các phần tử là số chẵn trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
