public class baitap1 {
    public static void main(String[] args) {


//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 1) {
//                System.out.println("Số lẻ: " + i);
//            } else if (i % 2 == 0) {
//                System.out.println("Số chẵn: " + i);
//            }
//        }

        int n =1;
        while (n <100){
            if (n%2 == 0) {
                System.out.println("số chẵn: " + n);
            }else System.out.println("số lẻ: " + n);
            n++;
        }
    }
}
