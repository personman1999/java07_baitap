import java.util.Scanner;

public class baitap9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        System.out.println("Nhập giá trị cần so sánh:");
        int giaTri = scanner.nextInt();

        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] > giaTri) {
                dem++;
            }
        }

        System.out.println("Số lượng phần tử lớn hơn " + giaTri + " là: " + dem);
    }
}
