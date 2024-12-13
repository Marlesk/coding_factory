package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Πρόγραμμα που μετατρέπει ακέραιες θερμοκρασίες Φαρενάιτ (Fahrenheit)
 * στην κλίμακα Κελσίου.
 */

public class Temperature {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση μεταβλητών
        Scanner temp = new Scanner(System.in);
        int celsius = 0;
        int farhrenheit = 0;

        //Εντολές
        System.out.println("Δώσε μια θερμοκρασία σε βαθμούς Φαρενάιτ");
        farhrenheit = temp.nextInt();
        celsius = 5 * (farhrenheit - 32) / 9;

        //Εκτύπωση
        System.out.printf("Η θερμοκρασία %d\u2109 αντιστοιχεί στην θερμοκρασία %d\u2103",farhrenheit,celsius);
    }
}
