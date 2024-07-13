public class baitap3 {
    public static void main(String[] args) {
//        int dem = 0;
//        for (int i = 0; i <= 1000; i++) {
//            if (i % 3 == 0) {
//                dem++;
//            }
//        }
//        System.out.println("có: " + dem + " số chia hết cho 3");

        int n=0;
        int dem = 0;
        while (n<=1000){
            if (n %3 == 0) {
                dem++;
            }
            n++;
        }

        System.out.println("có: " + dem + " số chia hết cho 3");
    }
}
