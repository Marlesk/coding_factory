package gr.aueb.cf.ch12.exercises;

public class User {
    private Long id;
    private String firtsname;
    private String lastname;

    public User() {
    }

    public User(Long id, String firtsname, String lastname) {
        this.id = id;
        this.firtsname = firtsname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public String getFirtsname() {
        return firtsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
