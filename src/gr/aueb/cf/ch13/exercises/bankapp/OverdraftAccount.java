package gr.aueb.cf.ch13.exercises.bankapp;

/**
 * Defines an {@link OverdraftAccount} class.
 *
 * @author maria
 * @version 0.1
 * @since 0.1
 */
public class OverdraftAccount {
    private double balance;
    private double limitOverdraft;
    private String ssn;

    public OverdraftAccount() {

    }

    public OverdraftAccount(double balance, double limitOverdraft, String ssn) {
        this.balance = balance;
        this.limitOverdraft = limitOverdraft;
        this.ssn = ssn;
    }

    public String getSsn() { return ssn; }

    public void setSsn(String ssn) { this.ssn = ssn; }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimitOverdraft() {
        return limitOverdraft;
    }

    public void setLimitOverdraft(double limitOverdraft) {
        this.limitOverdraft = limitOverdraft;
    }

    /*
     * Public API
     */

    /**
     * Withdraws an amount of money or overdraft with specific limit from the {@link OverdraftAccount}
     * based on a valid ssn checked by {@link OverdraftAccount #isSsnValid(String)}
     *
     * @param amount the amount to be withdrawn.
     * @param ssn the given ssn.
     * @throws Exception if the ssn is not valid or the amount is negative.
     */
    public void withdraw(double amount,String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn " + ssn + " δεν είναι έγκυρο.");
            }

            if (amount > 0) {
                if (amount - balance <= limitOverdraft) {
                    balance -= amount;
                    System.out.println("Η ανάληψη των " + amount + "€ ολοκληρώθηκε. Το νέο υπόλοιπο είναι: " + balance + "€");
                } else {
                    System.out.println("Η ανάληψη των " + amount + "€ δεν μπορεί να πραγματοποιηθεί. Μη επαρκής υπόλοιπο ή υπερανάλυψη.");
                }
            } else {
                throw new Exception("Tο ποσό δεν μπορεί να είναι αρνητικό");
            }
        } catch (Exception e) {
            System.err.println("Σφάλμα. " + e.getMessage());
            throw e;
        }
    }

    /**
     * Deposits a certain amount of money.
     * @param amount the amount of money to be deposited.
     * @throws Exception if the amount is negative
     */
    public void deposit(double amount, String ssn) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Tο ποσό δεν μπορεί να είναι αρνητικό");
            }
            balance += amount;
            System.out.println("Η κατάθεση των " + amount + "€ ολοκληρώθηκε. Το νέο υπόλοιπο είναι: " + balance + "€");    // logging
        } catch (Exception e) {
            System.err.println("Σφάλμα. " + e.getMessage());
            throw e;
        }
    }

    // Internals
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

    /**
     * Print the details of account
     */
    public void printDetails() {
        System.out.println("Υπόλοιπο λογαριασμού " + ssn + ": " + balance + "€");
        System.out.println("Όριο υπερανάληψης λογαριασμού " + ssn + ": " + limitOverdraft + "€");
    }
}
