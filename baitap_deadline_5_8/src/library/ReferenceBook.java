package library;

public class ReferenceBook extends Book {
    private String field;

    // Constructor
    public ReferenceBook(String title, String author, String isbn, String field) {
        super(title, author, isbn);
        this.field = field;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lĩnh vực: " + getField());
    }

    // Getter và Setter
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
