package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αν ο χρήστης μαντέψει σωστά τον αριθμό-κλειδί, εμφανίζεται το Bingo
 * Καλό θα ήταν ωστόσο να καλυφθεί και η περίπτωση που δεν μαντέψει σωστά
 * να προσπαθήσει ξανά
 */
public class BingoIfApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KEY = 12;
        int num = 0;

        while (true) {
            System.out.println("Give a number");
            num = scanner.nextInt();

            if (num==KEY){
                System.out.println("Bingo");
                break;
            }

            System.out.println("Try Again");

        }

    }
}
