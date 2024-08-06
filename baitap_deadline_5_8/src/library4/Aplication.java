package library4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        List<Book> listBook = new ArrayList<>();

        TextBook textBook1 = new TextBook();
        textBook1.title = "Sách số 1";
        textBook1.author = "Tác giả 1";
        textBook1.isbn = "ISBN 1";
        textBook1.setSubject("Subject 1");

        TextBook textBook2 = new TextBook();
        textBook2.title = "Sách số 2";
        textBook2.author = "Tác giả 2";
        textBook2.isbn = "ISBN 2";
        textBook2.setSubject("Subject 2");

        ReferenceBook referenceBook = new ReferenceBook();
        referenceBook.title = "Sách referenceBook số 1";
        referenceBook.author = "Tác giả referenceBook 1";
        referenceBook.isbn = "ISBN referenceBook 1";
        referenceBook.setField("Field 1");

        listBook.add(textBook1);
        listBook.add(textBook2);
        listBook.add(referenceBook);

        User user = new User();
        user.setName("Nguyễn Văn A");
        user.setUserId(1);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nThư viện hiện có các sách sau:");
            for (int i = 0; i < listBook.size(); i++) {
                System.out.println(i + ": " + listBook.get(i).title);
            }

            System.out.println("\nChọn hành động:");
            System.out.println("1. Mượn sách");
            System.out.println("2. Trả sách");
            System.out.println("3. Thoát");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Nhập vị trí sách mà bạn muốn mượn:");
                int viTriMuon = scanner.nextInt();
                if (viTriMuon >= 0 && viTriMuon < listBook.size()) {
                    Book borrowBook = listBook.get(viTriMuon);
                    user.borrow(borrowBook);
                    listBook.remove(viTriMuon);
                } else {
                    System.out.println("Vị trí không hợp lệ.");
                }
            } else if (choice == 2) {
                if (user.getBorrowed_books().isEmpty()) {
                    System.out.println("Bạn chưa mượn sách nào nên không thể trả sách.");
                } else {
                    System.out.println("Nhập vị trí sách mà bạn muốn trả:");
                    for (int i = 0; i < user.getBorrowed_books().size(); i++) {
                        System.out.println(i + ": " + user.getBorrowed_books().get(i).title);
                    }
                    int viTriTra = scanner.nextInt();
                    if (viTriTra >= 0 && viTriTra < user.getBorrowed_books().size()) {
                        Book returnBook = user.getBorrowed_books().get(viTriTra);
                        user.returnBook(returnBook);
                        listBook.add(returnBook);

                        // Sau khi trả sách, hiển thị menu mới
                        while (true) {
                            System.out.println("\nBạn có muốn:");
                            System.out.println("1. Tiếp tục mượn sách");
                            System.out.println("2. Thoát chương trình");
                            int postReturnChoice = scanner.nextInt();

                            if (postReturnChoice == 1) {
                                break; // Quay lại menu chính để mượn sách
                            } else if (postReturnChoice == 2) {
                                System.out.println("Thoát chương trình.");
                                scanner.close();
                                System.exit(0);
                            } else {
                                System.out.println("Lựa chọn không hợp lệ.");
                            }
                        }
                    } else {
                        System.out.println("Vị trí không hợp lệ.");
                    }
                }
            } else if (choice == 3) {
                System.out.println("Thoát chương trình.");
                scanner.close();
                System.exit(0);
            } else {
                System.out.println("Lựa chọn không hợp lệ.");
            }

            System.out.println("\nSố lượng sách trong thư viện: " + listBook.size());
            System.out.println("Số lượng sách người dùng đã mượn: " + user.getBorrowed_books().size());
        }
    }
}
