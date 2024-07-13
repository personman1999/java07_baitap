import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền hiện có: ");
        double tienGoc = scanner.nextDouble();
        System.out.print("Nhập số tiền mục tiêu: ");
        double soTienMongMuon = scanner.nextDouble();
        System.out.print("Nhập lãi suất tiết kiệm (%): ");
        double laiSuat = scanner.nextDouble();

        int years = 0;
        while (tienGoc < soTienMongMuon) {
            tienGoc += tienGoc * (laiSuat / 100);
            years++;
        }

        System.out.println("Số năm cần thiết để đạt mục tiêu tiết kiệm: " + years);

        scanner.close();
    }
}
