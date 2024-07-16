import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int n = scanner.nextInt();
        chanLe(n);
    }

    public static void chanLe(int n){
        if (n %2 == 0) {
            System.out.println("n là số chẵn");
        }else System.out.println("n là số lẻ");
    }
}
