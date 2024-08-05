package library;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho TextBook
        System.out.println("Nhập thông tin cho Sách giáo khoa:");
        System.out.print("Tiêu đề: ");
        String textBookTitle = scanner.nextLine();
        System.out.print("Tác giả: ");
        String textBookAuthor = scanner.nextLine();
        System.out.print("ISBN: ");
        String textBookISBN = scanner.nextLine();
        System.out.print("Môn học: ");
        String textBookSubject = scanner.nextLine();

        TextBook textBook = new TextBook(textBookTitle, textBookAuthor, textBookISBN, textBookSubject);

        // Nhập thông tin cho ReferenceBook
        System.out.println("\nNhập thông tin cho Sách tham khảo:");
        System.out.print("Tiêu đề: ");
        String referenceBookTitle = scanner.nextLine();
        System.out.print("Tác giả: ");
        String referenceBookAuthor = scanner.nextLine();
        System.out.print("ISBN: ");
        String referenceBookISBN = scanner.nextLine();
        System.out.print("Lĩnh vực: ");
        String referenceBookField = scanner.nextLine();

        ReferenceBook referenceBook = new ReferenceBook(referenceBookTitle, referenceBookAuthor, referenceBookISBN, referenceBookField);

        // Hiển thị thông tin
        System.out.println("\nThông tin Sách giáo khoa:");
        textBook.displayInfo();

        System.out.println("\nThông tin Sách tham khảo:");
        referenceBook.displayInfo();

        scanner.close();
    }
}
