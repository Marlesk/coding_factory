package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη, την αρχική τιμή του i,
 * την τελική τιμή και το βήμα αύξησης
 * Υπολογίζει τις επαναλήψεις (iterations)
 * και εκτυπώνει την τιμή του i σε κάθε επανάληψη
 */

public class ForFlexApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Give start value, end value and step");
        startValue = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startValue; i <= endValue; i+=step) {
            System.out.println(i + " ");
            iterations++;

        }
        System.out.println("Iterations = " + iterations);
    }
}
