package gr.aueb.cf.ch10.projects;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Project 05
 */
public class TheaterApp {

    public static void main(String[] args) {
        boolean[][] seats = new boolean[12][30];
        char column = ' ';
        int row = 0;
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        inputValues(seats);
        printArray(seats);
        do {
            printMenu();
            try {
                choice = scanner.nextInt();
                if (!isValidChoice(choice)) {
                    System.out.println("Λάθος επιλογή! Επιλέξτε μεταξύ του 1-3");
                    continue;
                }
                if (choice == 3) {
                    System.out.println("Επιλέξατε έξοδο από το μενού επιλογών");
                    break;
                }
               column = seatColumn(scanner);
               row = seatRow(scanner);
               choiceMenu(choice, column, row - 1, seats);
            } catch(InputMismatchException e) {
                System.out.println("Λάθος αριθμός! Δώστε έναν αριθμό από 1 έως 3.");
                scanner.nextLine();
            }
            printArray(seats);
        } while (true);
        System.out.println("Ευχαριστούμε για την προτίμησή σας");
    }

    //Αρχικοποίηση πίνακα
    public static void inputValues(boolean[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = false;
            }
        }
    }

    //Εκτύπωση μενού επιλογών
    public static void printMenu() {
        System.out.println("Επιλέξτε τι θέλετε από το παρακάτω μενού (1-3):");
        System.out.println("Επιλογή 1: Κράτηση θέσης");
        System.out.println("Επιλογή 2: Ακύρωση κράτησης");
        System.out.println("Επιλογή 3: Έξοδος από το μενού επιλογών");
    }

    //Έλεγχος επιλογής χρήστη από το μενού επιλογών
    public static boolean isValidChoice(int choice) {
        if (choice <= 0 || choice > 3) {
            return false;
        }
        return true;
    }

    //Εκτύπωση του πίνακα θέσεων του θεάτρου
    public static void printArray(boolean[][] seats) {
        System.out.println("Θέσεις Θεάτρου:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Επιλογή στήλης
    public static char seatColumn(Scanner scanner) {
        char column = ' ';

        System.out.println("Δώστε στήλη θέσης (A-L):");
        String input = scanner.next();
        column = input.toUpperCase().charAt(0);
        while (column < 'A' || column > 'L' || input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Λάθος στήλη! Δώστε έναν χαρακτήρα από A έως L.");
            input = scanner.next();
            column = input.toUpperCase().charAt(0);
        }
        return column;
    }

    //Επιλογή σειράς
    public static int seatRow(Scanner scanner) {
        int row = 0;

        System.out.println("Δώστε σειρά θέσης (1-12):");
        while (true) {
            try {
                row = scanner.nextInt();
                if (row >= 1 && row <= 12) {
                    break;
                } else {
                    System.out.println("Λάθος σειρά! Δώστε έναν αριθμό από 1 έως 12.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Λάθος σειρά! Δώστε έναν αριθμό από 1 έως 12.");
                scanner.nextLine();
            }
        }
        return row;
    }

    //Για κράτηση θέσης
    public static void book(char column, int row, boolean[][] seats) {
        int col = (int) column - 65;

        if (seats[col][row] == false) {
            seats[col][row] = true;
            System.out.printf("Η θέση %c%d κρατήθηκε \n", column, row+1);
        } else {
            System.out.printf("Η θέση %c%d είναι ήδη κλεισμένη. Επιλέξτε άλλη κενή θέση \n", column, row+1);
        }
    }

    //Για ακύρωση θέσης
    public static void cancel(char column, int row, boolean[][] seats) {
        int col = (int) column - 65;

        if (seats[col][row] == true) {
            seats[col][row] = false;
            System.out.printf("Η κράτηση για την θέση %c%d ακυρώθηκε \n", column, row+1);
        } else {
            System.out.printf("Η κράτηση για την θέση %c%d δεν μπορεί να ακυρωθεί γιατί δεν είναι κρατημένη. \n", column, row+1);
        }
    }

    //Ανάλογα με την επιλογή του χρήστη εκτελεί και την αντίστοιχη διαδικασία
    public static void choiceMenu(int choice, char column, int row, boolean[][] seats) {
        switch (choice) {
            case 1:
                System.out.println("Επιλέξατε να κλείσετε θέση");
                book(column,row,seats);
                break;
            case 2:
                System.out.println("Επιλέξατε να ακυρώσετε θέση");
                cancel(column,row,seats);
                break;
            case 3:
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }

}