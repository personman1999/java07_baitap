package library4;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    protected List<Book> borrowed_books;

    public User() {
        this.borrowed_books = new ArrayList<>();
    }

    public void borrow(Book book) {
        borrowed_books.add(book);
        System.out.println(name + " đã mượn sách: " + book.title);
    }

    public void returnBook(Book book) {
        if (borrowed_books.contains(book)) {
            borrowed_books.remove(book);
            System.out.println(name + " đã trả sách: " + book.title);
        } else {
            System.out.println("Sách '" + book.title + "' không có trong danh sách đã mượn.");
        }
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBorrowed_books() {
        return borrowed_books;
    }

    public void setBorrowed_books(List<Book> borrowed_books) {
        this.borrowed_books = borrowed_books;
    }
}
