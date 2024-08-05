package bank;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Đã rút: " + amount);
        } else {
            System.out.println("Vượt quá hạn mức thấu chi hoặc số tiền không hợp lệ.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hạn mức thấu chi: " + overdraftLimit);
    }
}
