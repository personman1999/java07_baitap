import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        // bài tập 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập số nguyên: ");
        int so = scanner.nextInt();

        if (so >= 0) {
            System.out.println("đây là số nguyên dương");
        }else System.out.println("đây là số nguyên âm");


        // bài tập 1.1
        if (so %2 == 0){
            System.out.println("đây là số chẵn");
        }else System.out.println("đây là số lẻ");


        // bài tập 1.2
        if (isPrime(so)) {
            System.out.println("Số nguyên tố");
        } else {
            System.out.println("Không phải số nguyên tố");
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
