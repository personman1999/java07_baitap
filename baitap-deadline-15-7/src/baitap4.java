import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];
        double[][] coordinates = new double[3][2];
        double schoolX, schoolY;

        // Nhập tọa độ trường học
        System.out.println("Nhập tọa độ X của trường học:");
        schoolX = scanner.nextDouble();
        System.out.println("Nhập tọa độ Y của trường học:");
        schoolY = scanner.nextDouble();
        scanner.nextLine();

        // Nhập tên và tọa độ nhà của 3 sinh viên
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập tên sinh viên " + (i + 1) + ":");
            names[i] = scanner.nextLine();
            System.out.println("Nhập tọa độ X của nhà sinh viên " + (i + 1) + ":");
            coordinates[i][0] = scanner.nextDouble();
            System.out.println("Nhập tọa độ Y của nhà sinh viên " + (i + 1) + ":");
            coordinates[i][1] = scanner.nextDouble();
            scanner.nextLine();
        }

        // Tìm sinh viên có nhà xa trường học nhất
        String farthestStudent = "";
        double maxDistance = -1;

        for (int i = 0; i < 3; i++) {
            double distance = Math.sqrt(Math.pow(coordinates[i][0] - schoolX, 2) + Math.pow(coordinates[i][1] - schoolY, 2));
            if (distance > maxDistance) {
                maxDistance = distance;
                farthestStudent = names[i];
            }
        }

        // Đầu ra
        System.out.println("Sinh viên có nhà xa trường học nhất là: " + farthestStudent + " với khoảng cách = " + maxDistance);

        scanner.close();
    }
}
