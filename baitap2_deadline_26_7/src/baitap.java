import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // a. Viết hàm nhập, hàm xuất
        nhapMang(array, scanner);
        xuatMang(array);

        // b. Tìm số lớn nhất và vị trí của nó trong mảng
        int maxIndex = timSoLonNhat(array);
        System.out.println("Số lớn nhất là " + array[maxIndex] + " ở vị trí " + maxIndex);

        // c. Tìm số âm đầu tiên và vị trí của nó trong mảng
        int firstNegativeIndex = timSoAmDauTien(array);
        if (firstNegativeIndex != -1) {
            System.out.println("Số âm đầu tiên là " + array[firstNegativeIndex] + " ở vị trí " + firstNegativeIndex);
        } else {
            System.out.println("Không có số âm trong mảng.");
        }

        // d. Tìm số âm lớn nhất và vị trí của nó trong mảng
        int maxNegativeIndex = timSoAmLonNhat(array);
        if (maxNegativeIndex != -1) {
            System.out.println("Số âm lớn nhất là " + array[maxNegativeIndex] + " ở vị trí " + maxNegativeIndex);
        } else {
            System.out.println("Không có số âm trong mảng.");
        }

        // e. Tính tổng các số chẵn
        int evenSum = tinhTongSoChan(array);
        System.out.println("Tổng các số chẵn là: " + evenSum);

        // f. Đếm có bao nhiêu số âm
        int negativeCount = demSoAm(array);
        System.out.println("Số lượng các số âm là: " + negativeCount);

        // g. Tổng các số âm
        int negativeSum = tongSoAm(array);
        System.out.println("Tổng các số âm là: " + negativeSum);

        // h. Cho người dùng nhập vào x và tìm x có trong mảng đó hay không
        System.out.println("Nhập giá trị x cần tìm: ");
        int x = scanner.nextInt();
        boolean found = timGiaTri(array, x);
        if (found) {
            System.out.println("Giá trị " + x + " có trong mảng.");
        } else {
            System.out.println("Giá trị " + x + " không có trong mảng.");
        }
    }

    // Hàm để nhập mảng
    public static void nhapMang(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    // Hàm để xuất mảng
    public static void xuatMang(int[] array) {
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Hàm tìm số lớn nhất và vị trí của nó trong mảng
    public static int timSoLonNhat(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Hàm tìm số âm đầu tiên và vị trí của nó trong mảng
    public static int timSoAmDauTien(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    // Hàm tìm số âm lớn nhất và vị trí của nó trong mảng
    public static int timSoAmLonNhat(int[] array) {
        int maxNegativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (maxNegativeIndex == -1 || array[i] > array[maxNegativeIndex]) {
                    maxNegativeIndex = i;
                }
            }
        }
        return maxNegativeIndex;
    }

    // Hàm tính tổng các số chẵn
    public static int tinhTongSoChan(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    // Hàm đếm số lượng số âm
    public static int demSoAm(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    // Hàm tính tổng các số âm
    public static int tongSoAm(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    // Hàm tìm giá trị x trong mảng
    public static boolean timGiaTri(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return true;
            }
        }
        return false;
    }
}
