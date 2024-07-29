import java.util.Scanner;
import java.util.ArrayList;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<>();

        while (true) {
            System.out.println("Chọn chức năng: 1. Thêm, 2. Xóa, 3. Cập nhật, 4. Thoát");
            int chucNang = scanner.nextInt();

            if (chucNang == 1) {
                System.out.println("Nhập giá trị cần thêm:");
                int giaTri = scanner.nextInt();
                mang.add(giaTri);
            } else if (chucNang == 2) {
                System.out.println("Nhập giá trị cần xóa:");
                int giaTri = scanner.nextInt();
                while (mang.contains(giaTri)) {
                    mang.remove((Integer) giaTri);
                }
            } else if (chucNang == 3) {
                System.out.println("Nhập giá trị cần cập nhật:");
                int giaTriCu = scanner.nextInt();
                System.out.println("Nhập giá trị mới:");
                int giaTriMoi = scanner.nextInt();
                for (int i = 0; i < mang.size(); i++) {
                    if (mang.get(i) == giaTriCu) {
                        mang.set(i, giaTriMoi);
                    }
                }
            } else if (chucNang == 4) {
                break;
            }

            System.out.println("Mảng hiện tại: " + mang);
        }
    }
}
