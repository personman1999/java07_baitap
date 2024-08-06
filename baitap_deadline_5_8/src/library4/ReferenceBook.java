package library4;

public class ReferenceBook extends Book {
    private String field;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Field: " + field);
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }


}
