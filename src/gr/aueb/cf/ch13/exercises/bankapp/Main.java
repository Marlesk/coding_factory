package gr.aueb.cf.ch13.exercises.bankapp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        OverdraftAccount account = new OverdraftAccount(500, 200, "GR150");
        JointAccount owners = new JointAccount("GR150");

        try {
            //account.deposit(300);

            account.withdraw(300, "GR150");

            account.withdraw(300, "GR150");

            account.withdraw(200,"GR150");

            account.printDetails();

            owners.NumberOwners(Arrays.asList("Μαρία", "Αντώνης"),"GR150");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

