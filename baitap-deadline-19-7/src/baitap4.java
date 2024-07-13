import java.util.Scanner;

public class baitap4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();

        int sum = sumOfPowers(x, n);

        System.out.println("Tổng S(n) = x + x^2 + x^3 + ... + x^n là: " + sum);

        scanner.close();
    }

    // Hàm tính tổng các lũy thừa của x từ x^1 đến x^n
    public static int sumOfPowers(int x, int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += power(x, i); // Gọi hàm tính lũy thừa x^i
        }
        return sum;
    }

    // Hàm tính lũy thừa của một số x với số mũ n
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
