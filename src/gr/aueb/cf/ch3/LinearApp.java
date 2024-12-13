package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαιρούμε δύο αριθμούς. Ελέγχει αν ο παρονομαστής είναι 0
 * δεν μπορεί να προχωρήσει η διαίρεση
 */

public class LinearApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true){
            System.out.println("Give a numerator");
            numerator = scanner.nextInt();

            if (numerator==0){
                System.out.println("The numerator is zero");
                break;
            }
            System.out.println("Give a denominator");
            denominator = scanner.nextInt();

            if (denominator==0) {
                System.out.println("The denominator must not be zero");
                continue;
            }
            result = numerator / denominator;
            System.out.println("Result = " + result);

        }

    }
}
