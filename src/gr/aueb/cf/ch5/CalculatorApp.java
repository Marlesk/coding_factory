package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα menu επιλογών με τις πράξεις, ο χρήστης επιλέγει
 * και ανάλογα εκτελείται η αντίστοιχη πράξη και
 * εκτυπώνεται το αποτέλεσμα. Εκτελείται επαναληπτικά μέχρι
 * ο χρήστης να επιλέξει έξοδο.
 */
public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int choice = 0;
        int result = 0;

        do {
            printMenu();
            choice = getUserChoice();

            if (choice < 1 || choice > 6) {
                System.out.println("Λάθος επιλογή");
                continue;
            }

            System.out.println("Δώσε δύο αριθμούς");
            num1 = getOneNumber();
            num2 = getOneNumber();
            result = getResult(num1,num2,choice);

            System.out.println("Result:"+result);

        } while (choice != 6);
        System.out.println("Thanks for using app");
    }

    /**
     * Εκτυπώνει το μενού
     */
    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο διαίρεσης");
        System.out.println("6. Έξοδος");
    }

    public static int getUserChoice() {
        return scanner.nextInt();
    }

    public static int getOneNumber() {
        return scanner.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid number: 0");
            return 0;
        }

        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid number: 0");
            return 0;
        }

        return a % b;
    }

    public static int getResult(int a, int b, int choice){
        int result = 0;

        switch (choice) {
            case 1:
                result = add(a,b);
                break;
            case 2:
                result = sub(a,b);
                break;
            case 3:
                result = mul(a,b);
                break;
            case 4:
                result = div(a,b);
                break;
            case 5:
                result = mod(a,b);
                break;
            case 6:
                System.out.println("Επιλέξατε έξοδο");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }

        return result;
    }
}
