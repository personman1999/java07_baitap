import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("nhập số c: ");
        int c = scanner.nextInt();

        timSoLonNhat(a, b,c);

    }

    public static void timSoLonNhat(int a, int b, int c){

        int max = a;
        if (b > max ) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Số lớn nhất là: "+max);
    }

}
