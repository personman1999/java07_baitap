package library;

public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Tiêu đề: " + getTitle());
        System.out.println("Tác giả: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
    }

    // Getter và Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
