package account;

import java.time.LocalDate;
import java.util.Date;

public class account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private LocalDate dateCreate = LocalDate.now();

    public account() {

    }
    public account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 * 100;
    }

    public double getMonthlyInterest() {
        LocalDate dateNow = LocalDate.now();
        int days = ((dateNow.getYear() - dateCreate.getYear()) * 365 + (dateNow.getDayOfMonth() - dateCreate.getDayOfMonth())) / 12  + (dateNow.getMonth().getValue() - dateCreate.getMonth().getValue());
        return balance * getMonthlyInterestRate();
    }
    public double withdraw(double money) {
        return balance -= money;
    }
    public double deposit(double money) {
        return balance += money;
    }


}
