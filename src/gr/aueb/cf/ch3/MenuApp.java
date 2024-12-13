package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίστε επαναληπτικά ένα μενού με επιλογές 1-4,
 * το οποίο να επαναλαμβάνεται μέχρι ο χρήστης να δώσει τον αριθμό 5.
 * Θα πρέπει επίσης να ελέγχετε αν ο χρήστης δώσει αριθμό < 0 ή > 5
 * και να δίνετε κατάλληλο μήνυμα.
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;


        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = scanner.nextInt();

            if ((choice <= 0) || (choice > 5)){
                System.out.println("Λάθος επιλογή. Δώσε επιλογή μεταξύ του 1-5");
            } else if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            }else {
                System.out.println("Επιλέξατε Έξοδος");
            }
        } while (choice!=5);
    }
}
