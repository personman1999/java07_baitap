package library4;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sách giáo khoa
        System.out.print("Nhập tiêu đề sách giáo khoa: ");
        String textBookTitle = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String textBookAuthor = scanner.nextLine();
        System.out.print("Nhập ISBN: ");
        String textBookIsbn = scanner.nextLine();
        System.out.print("Nhập môn học: ");
        String textBookSubject = scanner.nextLine();

        TextBook textBook = new TextBook(textBookTitle, textBookAuthor, textBookIsbn, textBookSubject);

        // Nhập thông tin sách tham khảo
        System.out.print("Nhập tiêu đề sách tham khảo: ");
        String referenceBookTitle = scanner.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String referenceBookAuthor = scanner.nextLine();
        System.out.print("Nhập ISBN: ");
        String referenceBookIsbn = scanner.nextLine();
        System.out.print("Nhập lĩnh vực: ");
        String referenceBookField = scanner.nextLine();

        ReferenceBook referenceBook = new ReferenceBook(referenceBookTitle, referenceBookAuthor, referenceBookIsbn, referenceBookField);

        // Nhập thông tin người dùng
        System.out.print("Nhập ID người dùng: ");
        String userId = scanner.nextLine();
        System.out.print("Nhập tên người dùng: ");
        String userName = scanner.nextLine();

        User user = new User(userId, userName);

        // Người dùng mượn sách
        user.borrow(textBook);
        user.borrow(referenceBook);

        // Hiển thị thông tin người dùng
        user.displayInfo();

        // Người dùng trả sách
        System.out.print("Nhập tiêu đề sách để trả: ");
        String bookTitleToReturn = scanner.nextLine();

        Book bookToReturn = null;
        for (Book book : user.getBorrowedBooks()) {
            if (book.title.equals(bookTitleToReturn)) {
                bookToReturn = book;
                break;
            }
        }

        if (bookToReturn != null) {
            user.returnBook(bookToReturn);
        } else {
            System.out.println("Không tìm thấy sách với tiêu đề: " + bookTitleToReturn);
        }

        // Hiển thị thông tin người dùng sau khi trả sách
        user.displayInfo();

        scanner.close();
    }
}
