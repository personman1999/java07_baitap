import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số phần tử của mảng: ");
        int soPhanTu = scanner.nextInt();

        if (soPhanTu <= 0) {
            System.out.println("Số phần tử phải lớn hơn 0.");
        } else {
            int[] mang = new int[soPhanTu];
            int tong = 0;

            System.out.println("Nhập vào các phần tử của mảng:");
            for (int i = 0; i < soPhanTu; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                mang[i] = scanner.nextInt();
                tong += mang[i];
            }

            double giaTriTrungBinh = (double) tong / soPhanTu;
            System.out.println("Giá trị trung bình của mảng là: " + giaTriTrungBinh);
        }
    }
}
