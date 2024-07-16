import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("nhập menu: ");
        System.out.print("1: cộng ");
        System.out.print("2: trừ ");
        System.out.print("3: nhân: ");
        System.out.print("4: chia: ");
        int soChon = scanner.nextInt();

        menu(soChon, a, b);

    }
    public static void menu(int banChon, int a, int b){
        double kq =0;
        switch (banChon){
            case 1:
                kq = cong(a,b);
                System.out.println("kết quả " + kq);
                break;
            case 2:
                kq = tru(a, b);
                System.out.println("kết quả " + kq);
                break;
            case 3:
                kq = nhan(a, b);
                System.out.println("kết quả " + kq);

                break;
            case 4:
                kq = chia(a, b);
                System.out.println("kết quả " + kq);
                break;
            default:
                System.out.println("không hợp lệ");
                break;
        }
    }
    public static double cong(int a, int b){
        return  a + b;
    }
    public static double tru(int a, int b){
        return a - b;
    }
    public static double nhan(int a, int b){
        return a * b;
    }
    public static double chia(int a, int b){
        return (double) a / b;
    }
}
