package gr.aueb.cf.ch15;

public class Person {
    private long id;
    private String lastname;
    private String firstname;

    public Person() {

    }

    public Person(long id, String lastname, String firstname) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void work() {
        System.out.println("Doing some work");
    }

    public void speak() {
        System.out.println("Says something");
    }
}
