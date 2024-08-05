package library4;

class ReferenceBook extends Book {
    private String field;

    public ReferenceBook(String title, String author, String isbn, String field) {
        super(title, author, isbn);
        this.field = field;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Field: " + field);
    }
}
