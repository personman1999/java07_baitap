package library4;

import java.util.ArrayList;
import java.util.List;

class User {
    private String userId;
    private String name;
    private List<Book> borrowedBooks;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrow(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " đã mượn sách: " + book.title);
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println(name + " đã trả sách: " + book.title);
        } else {
            System.out.println("Sách không được tìm thấy trong danh sách mượn.");
        }
    }

    public void displayInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Borrowed Books: ");
        for (Book book : borrowedBooks) {
            book.displayInfo();
            System.out.println();
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
