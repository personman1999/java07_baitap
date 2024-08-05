package company;

public class PartTimeEmployee extends Employee {
    private int hourlyRate;
    private int hoursWorked;

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Giá theo giờ: " + hourlyRate);
        System.out.println("Số giờ làm việc: " + hoursWorked);
    }

    @Override
    public void calculate_salary() {
        setSalary(hourlyRate * hoursWorked);
    }
}
