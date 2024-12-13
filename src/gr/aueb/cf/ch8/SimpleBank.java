package gr.aueb.cf.ch8;

import java.util.Scanner;

/*
*Όταν η εξαίρεση ριχτεί μέσα στη μέθοδο withdraw, αυτή πιάστηκε και διαχειρίστηκε εκεί με το try-catch.
*Όμως, επειδή το throw επαναρίχνει την εξαίρεση, αυτή επιστρέφει στη μέθοδο main για να την πιάσει ξανά.
*Επομένως, η εξαίρεση προκύπτει και η ροή του προγράμματος διακόπτεται
* μόνο αν δεν υπάρχει catch για να την πιάσει.
* Εφόσον την πιάνεις στην main, το πρόγραμμα συνεχίζει κανονικά με το μήνυμα σφάλματος
* να εμφανίζεται στον χρήστη.
 */
public class SimpleBank {

    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("--- Simple Bank Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choice an option: ");

            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        deposit(50);
                        break;
                    case 2:
                        withdraw(100);
                        break;
                    case 3:
                        System.out.println("Current balance: $" + balance);
                        break;
                    case 4:
                        System.out.println("Thanks for using Simple Bank. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch(IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    public static void withdraw(double amount) throws IllegalArgumentException {
        try {
            if (amount <= 0 || amount > balance) {
                throw new IllegalArgumentException("Not invalid amount");
            } else {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Amount must be positive.");
        }
    }
}
