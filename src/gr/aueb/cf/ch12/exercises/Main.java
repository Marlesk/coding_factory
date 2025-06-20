package gr.aueb.cf.ch12.exercises;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        User u = new User(7800000000L, "Maria", "L.");
        UserCredentials uc = new UserCredentials(7800000000L,"marles","abfvds");

        System.out.println("User Id:" + u.getId());
        System.out.println("Firstanme:" + u.getFirtsname());
        System.out.println("Lastname:" + u.getLastname());

        System.out.println("UserCredentials Id:" + uc.getId());
        System.out.println("Username:" + uc.getUsername());
        System.out.println("Password:" + uc.getPassword());
    }

}
