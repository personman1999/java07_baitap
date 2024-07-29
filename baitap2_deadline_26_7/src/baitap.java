import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int soPhanTu = scanner.nextInt();

        int[] mang = new int[soPhanTu];

        // a. Viết hàm nhập, hàm xuất
        nhapMang(mang, scanner);
        xuatMang(mang);

        // b. Tìm số lớn nhất và vị trí của nó trong mảng
        int viTriSoLonNhat = timSoLonNhat(mang);
        System.out.println("Số lớn nhất là " + mang[viTriSoLonNhat] + " ở vị trí " + viTriSoLonNhat);

        // c. Tìm số âm đầu tiên và vị trí của nó trong mảng
        int viTriSoAmDauTien = timSoAmDauTien(mang);
        if (viTriSoAmDauTien != -1) {
            System.out.println("Số âm đầu tiên là " + mang[viTriSoAmDauTien] + " ở vị trí " + viTriSoAmDauTien);
        } else {
            System.out.println("Không có số âm trong mảng.");
        }

        // d. Tìm số âm lớn nhất và vị trí của nó trong mảng
        int viTriSoAmLonNhat = timSoAmLonNhat(mang);
        if (viTriSoAmLonNhat != -1) {
            System.out.println("Số âm lớn nhất là " + mang[viTriSoAmLonNhat] + " ở vị trí " + viTriSoAmLonNhat);
        } else {
            System.out.println("Không có số âm trong mảng.");
        }

        // e. Tính tổng các số chẵn
        int tongSoChan = tinhTongSoChan(mang);
        System.out.println("Tổng các số chẵn là: " + tongSoChan);

        // f. Đếm có bao nhiêu số âm
        int soLuongSoAm = demSoAm(mang);
        System.out.println("Số lượng các số âm là: " + soLuongSoAm);

        // g. Tổng các số âm
        int tongSoAm = tongSoAm(mang);
        System.out.println("Tổng các số âm là: " + tongSoAm);

        // h. Cho người dùng nhập vào x và tìm x có trong mảng đó hay không
        System.out.println("Nhập giá trị x cần tìm: ");
        int x = scanner.nextInt();
        boolean timThay = timGiaTri(mang, x);
        if (timThay) {
            System.out.println("Giá trị " + x + " có trong mảng.");
        } else {
            System.out.println("Giá trị " + x + " không có trong mảng.");
        }
    }

    // Hàm để nhập mảng
    public static void nhapMang(int[] mang, Scanner scanner) {
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
    }

    // Hàm để xuất mảng
    public static void xuatMang(int[] mang) {
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }

    // Hàm tìm số lớn nhất và vị trí của nó trong mảng
    public static int timSoLonNhat(int[] mang) {
        int viTriSoLonNhat = 0;
        for (int i = 1; i < mang.length; i++) {
            if (mang[i] > mang[viTriSoLonNhat]) {
                viTriSoLonNhat = i;
            }
        }
        return viTriSoLonNhat;
    }

    // Hàm tìm số âm đầu tiên và vị trí của nó trong mảng
    public static int timSoAmDauTien(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    // Hàm tìm số âm lớn nhất và vị trí của nó trong mảng
    public static int timSoAmLonNhat(int[] mang) {
        int viTriSoAmLonNhat = -1;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < 0) {
                if (viTriSoAmLonNhat == -1 || mang[i] > mang[viTriSoAmLonNhat]) {
                    viTriSoAmLonNhat = i;
                }
            }
        }
        return viTriSoAmLonNhat;
    }

    // Hàm tính tổng các số chẵn
    public static int tinhTongSoChan(int[] mang) {
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                tong += mang[i];
            }
        }
        return tong;
    }

    // Hàm đếm số lượng số âm
    public static int demSoAm(int[] mang) {
        int dem = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < 0) {
                dem++;
            }
        }
        return dem;
    }

    // Hàm tính tổng các số âm
    public static int tongSoAm(int[] mang) {
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] < 0) {
                tong += mang[i];
            }
        }
        return tong;
    }

    // Hàm tìm giá trị x trong mảng
    public static boolean timGiaTri(int[] mang, int x) {
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == x) {
                return true;
            }
        }
        return false;
    }
}
