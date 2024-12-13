package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = in.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error choice, choose beetween 1-5");
                continue;
            }

            doOneChoice(choice);

        }while (choice!=5);
    }


    /**
     * Print a menu
     */
    public static void printMenu() {
        System.out.println("Επίλεξε ένα από τα παρακάτω");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
    }

    public static boolean isChoiceValid(int choice) {
        return choice>=1 && choice<=5;
    }

    public static void doOneChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Επιτυχής εισαγωγή");
                break;
            case 2:
                System.out.println("Επιτυχής διαγραφή");
                break;
            case 3:
                System.out.println("Επιτυχής αναζήτηση");
                break;
            case 4:
                System.out.println("Επιτυχής ενημέρωση");
                break;
            case 5:
                System.out.println("Επιτυχής έξοδο");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }
}
