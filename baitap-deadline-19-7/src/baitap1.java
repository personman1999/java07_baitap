import java.util.Random;
import java.util.Scanner;

public class baitap1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int soLanNguoiChoiWin = 0, soLanMayTinhWin = 0, soHoa = 0;
        String[] luaChon = {"Bao", "Kéo", "Kim"};

        boolean tiepTuc = true;
        while (tiepTuc) {
            System.out.println("Nhập lựa chọn của bạn (1 cho Bao, 2 cho Kéo, 3 cho Kim, 0 để thoát): ");
            int luaChonNguoiChoi = scanner.nextInt();

            if (luaChonNguoiChoi == 0) {
                tiepTuc = false;
                continue;
            }

            int luaChonMayTinh = random.nextInt(3) + 1;
            System.out.println("Máy tính chọn " + luaChon[luaChonMayTinh - 1]);

            if (luaChonNguoiChoi == luaChonMayTinh) {
                System.out.println("Hòa!");
                soHoa++;
            } else if ((luaChonNguoiChoi == 1 && luaChonMayTinh == 2) ||
                    (luaChonNguoiChoi == 2 && luaChonMayTinh == 3) ||
                    (luaChonNguoiChoi == 3 && luaChonMayTinh == 1)) {
                System.out.println("Bạn thắng!");
                soLanNguoiChoiWin++;
            } else {
                System.out.println("Máy tính thắng!");
                soLanMayTinhWin++;
            }

            // Yêu cầu người chơi nhập số bất kỳ để tiếp tục
            System.out.println("Nhấn bất kỳ số để tiếp tục chơi, hoặc 0 để thoát: ");
            int luaChonTiepTuc = scanner.nextInt();
            tiepTuc = (luaChonTiepTuc != 0);
        }

        System.out.println("Kết quả cuối cùng:");
        System.out.println("Bạn: " + soLanNguoiChoiWin);
        System.out.println("Máy tính: " + soLanMayTinhWin);
        System.out.println("Hòa: " + soHoa);
        if ((soLanNguoiChoiWin + soLanMayTinhWin) > 0) {
            double tiLeThang = (double) soLanNguoiChoiWin / (soLanNguoiChoiWin + soLanMayTinhWin) * 100;
            System.out.printf("Tỉ lệ thắng: %.2f%%\n", tiLeThang);
        } else {
            System.out.println("Chưa có ván nào được chơi.");
        }
    }
}
