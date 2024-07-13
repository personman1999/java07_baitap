import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        //đầu vào

        int so1, so2, so3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ 1: ");
        so1 = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ 2: ");
        so2 = scanner.nextInt();
        System.out.println("Nhập số nguyên thứ 3: ");
        so3 = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        // Kiểm tra và đếm số chẵn, số lẻ
        if (so1 % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        if (so2 % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        if (so3 % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        // Xuất kết quả
        System.out.println("Số lượng số chẵn: " + evenCount);
        System.out.println("Số lượng số lẻ: " + oddCount);
    }
}
