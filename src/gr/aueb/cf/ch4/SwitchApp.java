package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει το μενού και διαβάζει την επιλογή του χρήστη
 * Στη συνέχεια ελέγχει την επιλογή και δίνει feedback
 * do-while μέχρι το choice να γίνει 3
 */

public class SwitchApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επίλεξε ένα από τα παρακάτω");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Έξοδος");

            System.out.println("Εισήγαγε την επιλογή σου");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Επίλεξες την εισαγωγή");
                    break;
                case 2:
                    System.out.println("Επίλεξες την διαγραφή");
                    break;
                case 3:
                    System.out.println("Επίλεξες την έξοδο");
                    break;
                default:
                    System.out.println("Λάθος επιλογή");
                    break;
            }

        } while (choice!=3);

        System.out.println("Goodbye!!");

    }
}
