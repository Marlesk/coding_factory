package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Μέθοδος που θα δέχεται μια θερμοκρασία σε βαθμούς Κελσίου (double)
 * και να την μετατρέπει σε Φαρενάιτ (double)
 * χρησιμοποιώντας τον τύπο:Κελσίου * 9/5 + 32
 */

public class FahrenheitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temperature = 0;
        double faren = 0;

        System.out.println("Δώσε μια θερμοκρασία:");
        temperature = in.nextDouble();

        faren = celsiusToFahrenheit(temperature);

        System.out.printf("Η θερμοκρασία %.2f\u2103 αντιστοιχεί στην θερμοκρασία %.2f\u2109",temperature,faren);
    }

    public static double celsiusToFahrenheit(double temp) {
       return temp * 9/5 + 32;
    }
}
