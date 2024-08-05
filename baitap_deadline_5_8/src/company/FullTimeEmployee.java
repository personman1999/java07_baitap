package company;

public class FullTimeEmployee extends Employee {
    private String benefits;

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Phúc lợi: " + benefits);
    }

    @Override
    public void calculate_salary() {
        // Logic tính lương cho nhân viên toàn thời gian
    }
}
