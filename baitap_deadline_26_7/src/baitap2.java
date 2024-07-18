import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        String[] chuSo = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên từ 1 đến 10: ");
        int so = scanner.nextInt();

        if (so >= 1 && so <= 10) {
            System.out.println(chuSo[so]);
        } else {
            System.out.println("Số không hợp lệ. Vui lòng nhập số từ 1 đến 10.");
        }

        scanner.close();
    }
}
