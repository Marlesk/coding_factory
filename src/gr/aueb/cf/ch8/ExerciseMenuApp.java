package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ExerciseMenuApp {

    public static void main(String[] args) {

        try {
            int choice = getChoice();
            if (choice >= 1 && choice <= 5) {
                System.out.println("Η επιλεγμένη επιλογή είναι:" + choice);
            }else {
                throw new IllegalArgumentException("Η επιλογή δεν είναι μεταξύ 1-5");
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Σφάλμα: " + e.getMessage());
        }
    }

    public static void printMenu() {
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
    }

    public static int getChoice() {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        System.out.println("Επίλεξε ένα από τα παρακάτω");
        printMenu();

        while(true) {
            if (in.hasNextInt()) {
                choice = in.nextInt();
                return choice;
            } else {
                System.out.println("Πρέπει να εισάγετε έναν ακέραιο αριθμό.");
                in.nextLine();
            }
        }
    }
}
