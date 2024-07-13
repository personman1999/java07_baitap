import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        //đầu vào
        Scanner scanner = new Scanner(System.in);
        String sv1, sv2, sv3;
        int namSinh1, namSinh2, namSinh3;
        System.out.println("nhập tên sinh viên thứ 1: ");
        sv1 = scanner.nextLine();
        System.out.println("nhập năm sinh của sinh viên thứ 1: ");
        namSinh1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("nhập tên sinh viên thứ 2: ");
        sv2 = scanner.nextLine();
        System.out.println("nhập năm sinh của sinh viên thứ 2: ");
        namSinh2 = scanner.nextInt();
        scanner.nextLine();


        System.out.println("nhập tên sinh viên thứ 3: ");
        sv3 = scanner.nextLine();
        System.out.println("nhập năm sinh của sinh viên thứ 3: ");
        namSinh3 = scanner.nextInt();

        // xử lý

        if (namSinh1 > namSinh2 && namSinh1> namSinh3) {
            System.out.println("sinh viên trẻ nhất là: " + sv1 + " có năm sinh: " + namSinh1);
        } else if (namSinh2 > namSinh1 && namSinh2> namSinh3) {
            System.out.println("sinh viên trẻ nhất là: " + sv2 + " có năm sinh: " + namSinh2);
        } else if (namSinh3 > namSinh2 && namSinh3> namSinh1) {
            System.out.println("sinh viên trẻ nhất là: " + sv3 + " có năm sinh: " + namSinh3);
        } else if (namSinh1 == namSinh2 && namSinh1> namSinh3) {
            System.out.println("sinh viên trẻ nhất là: " + sv1+" , "+sv2 + " có năm sinh: " + namSinh1);
        }else if (namSinh2 == namSinh3 && namSinh2>namSinh1) {
            System.out.println("sinh viên trẻ nhất là: " + sv2+" , "+sv3 + " có năm sinh: " + namSinh2);
        }else System.out.println("cả 3 sinh viên có năm sinh bằng nhau là: " + namSinh1);






    }
}
