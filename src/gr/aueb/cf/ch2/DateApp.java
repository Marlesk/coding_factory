package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Πρόγραμμα που διαβάζει από τον χρήστη 3 ακέραιους αριθμούς που αναπαριστούν
 * ημέρα, μήνα, έτος και την εμφανίζει σε μορφή: ΗΗ/ΜΜ/ΕΕ
 */

public class DateApp {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση μεταβήτών
        Scanner dmy = new Scanner(System.in);
        int day = 0, month = 0, year = 0;

        //Εντολές
        System.out.println("Δώσε ημέρα, μήνα και έτος");
        day = dmy.nextInt();
        month = dmy.nextInt();
        year = dmy.nextInt();
        year = year % 100;

        //Εκτύπωση
        System.out.printf("Η ημερομηνία είναι: %02d/%02d/%02d",day,month,year);
    }
}
