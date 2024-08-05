package bank;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho tài khoản tiết kiệm
        System.out.println("Tạo tài khoản tiết kiệm:");
        System.out.print("Nhập số tài khoản: ");
        String savingsAccountNumber = scanner.nextLine();
        System.out.print("Nhập tên chủ tài khoản: ");
        String savingsAccountHolder = scanner.nextLine();
        System.out.print("Nhập số dư ban đầu: ");
        double savingsBalance = scanner.nextDouble();
        System.out.print("Nhập lãi suất: ");
        double interestRate = scanner.nextDouble();
        scanner.nextLine();

        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsAccountHolder, savingsBalance, interestRate);
        savingsAccount.displayInfo();

        // Gửi tiền vào tài khoản tiết kiệm
        System.out.print("Nhập số tiền để gửi vào tài khoản tiết kiệm: ");
        double depositAmount = scanner.nextDouble();
        savingsAccount.deposit(depositAmount);
        savingsAccount.displayInfo();

        // Rút tiền từ tài khoản tiết kiệm
        System.out.print("Nhập số tiền để rút từ tài khoản tiết kiệm: ");
        double withdrawAmount = scanner.nextDouble();
        savingsAccount.withdraw(withdrawAmount);
        savingsAccount.displayInfo();

        // Thêm lãi suất vào tài khoản tiết kiệm
        savingsAccount.addInterest();
        savingsAccount.displayInfo();

        // Nhập thông tin cho tài khoản thanh toán
        System.out.println("\nTạo tài khoản thanh toán:");
        System.out.print("Nhập số tài khoản: ");
        scanner.nextLine();
        String checkingAccountNumber = scanner.nextLine();
        System.out.print("Nhập tên chủ tài khoản: ");
        String checkingAccountHolder = scanner.nextLine();
        System.out.print("Nhập số dư ban đầu: ");
        double checkingBalance = scanner.nextDouble();
        System.out.print("Nhập hạn mức thấu chi: ");
        double overdraftLimit = scanner.nextDouble();
        scanner.nextLine();

        CheckingAccount checkingAccount = new CheckingAccount(checkingAccountNumber, checkingAccountHolder, checkingBalance, overdraftLimit);
        checkingAccount.displayInfo();

        // Gửi tiền vào tài khoản thanh toán
        System.out.print("Nhập số tiền để gửi vào tài khoản thanh toán: ");
        depositAmount = scanner.nextDouble();
        checkingAccount.deposit(depositAmount);
        checkingAccount.displayInfo();

        // Rút tiền từ tài khoản thanh toán
        System.out.print("Nhập số tiền để rút từ tài khoản thanh toán: ");
        withdrawAmount = scanner.nextDouble();
        checkingAccount.withdraw(withdrawAmount);
        checkingAccount.displayInfo();

        scanner.close();
    }
}
