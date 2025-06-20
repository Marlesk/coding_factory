package gr.aueb.cf.ch15.BankApp.exceptions;

public class NegativeAmountException extends Exception {

    public NegativeAmountException(double amount) {
      super("Amount" + amount + " is sufficient.");
    }
}
