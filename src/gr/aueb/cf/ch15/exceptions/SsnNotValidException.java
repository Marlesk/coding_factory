package gr.aueb.cf.ch15.exceptions;

public class SsnNotValidException extends RuntimeException {

    public SsnNotValidException(String ssn) {
        super("SSN " + ssn + " is not valid.");
    }
}
