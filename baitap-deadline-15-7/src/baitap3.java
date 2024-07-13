import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        //đầu vào
        Scanner scanner = new Scanner(System.in);
        String cb1, cb2, cb3;
        String gioiTinh1,gioiTinh2,gioiTinh3;
        int namSinh1, namSinh2, namSinh3;
        System.out.println("nhập tên cán bộ thứ 1: ");
        cb1 = scanner.nextLine();

        System.out.println("nhập giới tính của cán bộ thứ 1: ");
        gioiTinh1 = scanner.nextLine();

        System.out.println("nhập năm sinh của cán bộ thứ 1: ");
        namSinh1 = scanner.nextInt();

        scanner.nextLine();


        System.out.println("nhập tên cán bộ thứ 2: ");
        cb2 = scanner.nextLine();

        System.out.println("nhập giới tính của cán bộ thứ 2: ");
        gioiTinh2 = scanner.nextLine();

        System.out.println("nhập năm sinh của cán bộ thứ 2: ");
        namSinh2 = scanner.nextInt();
        scanner.nextLine();



        System.out.println("nhập tên cán bộ thứ 3: ");
        cb3 = scanner.nextLine();

        System.out.println("nhập giới tính của cán bộ thứ 3: ");
        gioiTinh3 = scanner.nextLine();

        System.out.println("nhập năm sinh của cán bộ thứ 3: ");
        namSinh3 = scanner.nextInt();

        // xử lý

        if (namSinh1 > namSinh2 && namSinh1> namSinh3) {
            System.out.println("cán bộ trẻ nhất là: " + cb1 + " có năm sinh: " + namSinh1);
        } else if (namSinh2 > namSinh1 && namSinh2> namSinh3) {
            System.out.println("cán bộ trẻ nhất là: " + cb2 + " có năm sinh: " + namSinh2);
        } else if (namSinh3 > namSinh2 && namSinh3> namSinh1) {
            System.out.println("cán bộ trẻ nhất là: " + cb3 + " có năm sinh: " + namSinh3);
        } else if (namSinh1 == namSinh2 && namSinh1> namSinh3) {
            System.out.println("cán bộ trẻ nhất là: " + cb1+" , "+cb2 + " có năm sinh: " + namSinh1);
        }else if (namSinh2 == namSinh3 && namSinh2>namSinh1) {
            System.out.println("cán bộ trẻ nhất là: " + cb2+" , "+cb3 + " có năm sinh: " + namSinh2);
        }else System.out.println("cả 3 cán bộ có năm sinh bằng nhau là: " + namSinh1);
    }
}
