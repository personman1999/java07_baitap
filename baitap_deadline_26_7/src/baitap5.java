import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số phần tử của mảng: ");
        int soPhanTu = scanner.nextInt();

        if (soPhanTu <= 0) {
            System.out.println("Số phần tử phải lớn hơn 0.");
        } else {
            int[] mang = new int[soPhanTu];

            System.out.println("Nhập vào các phần tử của mảng:");
            for (int i = 0; i < soPhanTu; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                mang[i] = scanner.nextInt();
            }

            int lonNhat = mang[0];
            int nhoNhat = mang[0];

            for (int i = 1; i < soPhanTu; i++) {
                if (mang[i] > lonNhat) {
                    lonNhat = mang[i];
                }
                if (mang[i] < nhoNhat) {
                    nhoNhat = mang[i];
                }
            }

            System.out.println("Số lớn nhất trong mảng là: " + lonNhat);
            System.out.println("Số nhỏ nhất trong mảng là: " + nhoNhat);
        }

        scanner.close();
    }
}
