package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατροπή ημέρες, ώρες,λεπτά, δευτερόλεπτα σε συνολικά δευτερόλεπτα.
 * ο χρήστης δίνει τα δεδομένα (ακέραιοι αριθμοί).
 */

public class SecondDemo {

    public static void main(String[] args) {

        //Αρχικοποίηση και Δήλωση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int days=0,hours=0,minutes=0,seconds=0;
        int totalSeconds = 0;
        final int SEC_PER_DAY = 86400;
        final int SEC_HOURS = 3600;
        final int SEC_MINUTES = 60;

        //Εντολές
        System.out.println("Δώσε ημέρες, ώρες, λεπτά και δευτερόλεπτα");
        days = sc.nextInt();
        hours = sc.nextInt();
        minutes = sc.nextInt();
        seconds = sc.nextInt();
        totalSeconds = days * SEC_PER_DAY + hours * SEC_HOURS + minutes * SEC_MINUTES + seconds;

        //Εκτύπωση
        System.out.printf("Τα συνολικά δευτερόλεπτα είναι: %,d", totalSeconds);

    }
}
