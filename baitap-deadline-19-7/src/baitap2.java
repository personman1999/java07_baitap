public class baitap2 {
    public static void main(String[] args) {
        int targetSum = 10000;
        int minN = findMinN(targetSum);
        System.out.println("Số nguyên dương nhỏ nhất n sao cho tổng từ 1 đến n lớn hơn " + targetSum + " là: " + minN);
    }

    public static int findMinN(int targetSum) {
        int sum = 0;
        int n = 0;

        while (sum <= targetSum) {
            n++;
            if (n > 0) {
                sum += n;
            } else {
                System.out.println("Giá trị của n phải là số nguyên dương.");
                break;
            }
        }

        // Trả về giá trị của n
        return n;
    }
}
