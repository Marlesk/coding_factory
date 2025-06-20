package gr.aueb.cf.ch15.BankApp.exceptions;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient balance " + balance + " for amount " + amount);
    }
}
