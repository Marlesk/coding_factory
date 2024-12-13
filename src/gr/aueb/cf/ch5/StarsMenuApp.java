package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Θα εμφανίζει ένα μενού με 6 επιλογές,
 * ο χρήστης θα δίνει αριθμό για αστεράκια
 * Κάθε μία από τις πέντε πρώτες επιλογές θα υλοποιηθεί με μέθοδο
 */

public class StarsMenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = 0;
        int choice = 0;



       do {
           printMenu();
           choice = scanner.nextInt();

           if (choice <= 0 || choice > 6) {
               System.out.println("Λάθος επιλογή δώσε επιλογή από 1-6");
               continue;
           }

           if (choice >= 1 && choice < 6) {
               System.out.println("Δώσε έναν αριθμό:");
               numb = scanner.nextInt();
           }


           getResult(choice,numb);

        } while (choice != 6);
    }


    public static void printMenu() {
        System.out.println("Επιλέξτε κάτι από τα παρακάτω:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static void starHorizontal(int numb) {
        for (int i = 1; i <= numb; i++) {
            System.out.print('*');;
        }
        System.out.println(" ");
    }

    public static void starVertical(int numb) {
        for (int i = 1; i <= numb; i++) {
            System.out.println('*');;
        }
    }

    public static void starNxN(int numb) {
        for (int j = 1; j <= numb; j++) {
            starHorizontal(numb);
        }
    }

    public static void starAsc(int numb) {
        for (int j = 1; j <= numb; j++) {
            starHorizontal(j);
        }
    }

    public static void starDesc(int numb) {
        for (int j = numb; j <= numb && j > 0; j--) {
            starHorizontal(j);
        }
    }

    public static void getResult(int choice, int numb) {
        switch (choice) {
            case 1:
                starHorizontal(numb);
                break;
            case 2:
                starVertical(numb);
                break;
            case 3:
                starNxN(numb);
                break;
            case 4:
                starAsc(numb);
                break;
            case 5:
                starDesc(numb);
                break;
            case 6:
                System.out.println("Έξοδος");
                break;
            default:
                System.out.println("Λάθος Επιλογή");
                break;
        }
    }

}
