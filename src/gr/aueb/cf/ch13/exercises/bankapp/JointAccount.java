package gr.aueb.cf.ch13.exercises.bankapp;

import java.util.List;

/**
 * Defines an {@link JointAccount} class.
 *
 * @author maria
 * @version 0.1
 * @since 0.1
 */
public class JointAccount {
    private String ssn;

    public JointAccount() {

    }

    public JointAccount(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /*
     * Public API
     */


    /**
     * Check if the account from the {@link JointAccount} has two owners
     *
     * @param owners owners of account
     * @param ssn given ssn
     * @throws Exception if the ssn is not valid or the account has more than two owners.
     */

    public void NumberOwners(List<String> owners, String ssn) throws Exception {
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn " + ssn + " δεν είναι έγκυρο.");
            }
            if (owners.size() != 2) {
                throw new Exception("Ο λογαριασμός " + ssn + " δεν μπορεί να έχει πάνω από δύο κατόχους");
            }
            System.out.println("Ο λογαριασμός " + ssn + " έχει δύο κατόχους: " + String.join(" και ", owners));
        } catch (Exception e) {
            System.err.println("Σφάλμα. " + e.getMessage());
            throw e;
        }
    }

    //Internals
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}