package bank;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Đã thêm lãi suất: " + interest);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lãi suất: " + interestRate + "%");
    }
}
