package gr.aueb.cf.ch15.BankApp.exceptions;

public class SsnNotValidException extends Exception {

    public SsnNotValidException(String ssn) {
        super("SSN" + ssn + " is not valid.");
    }
}
