package gr.aueb.cf.ch15.BankApp;

public class User extends IdentifiableEntity {
    private String firstname;
    private String lastname;
    private String ssn;

    public User() {

    }

    public User(String firstname, String ssn, String lastname) {
        this.firstname = firstname;
        this.ssn = ssn;
        this.lastname = lastname;
    }

    //Copy constructor
    public User(User user) {
        firstname = user.getFirstname();
        lastname = user.getLastname();
        ssn = user.getSsn();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
