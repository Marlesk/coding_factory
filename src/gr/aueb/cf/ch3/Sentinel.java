package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των θετικών αριθμών που δίνει ο χρήστης
 * μέχρι να δώσει αρνητικό αριθμό και να σταματήσει.
 */

public class Sentinel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int positiveCount = 0;
        int number = 0;

        System.out.println("Give a number");
        /* number = in.nextInt(); */

        while ((number = in.nextInt()) > 0){
            positiveCount++;
            System.out.println("Give a number");
            /* number = in.nextInt(); */
        }

        System.out.println("The count of positive numbers is " + positiveCount);
    }
}
