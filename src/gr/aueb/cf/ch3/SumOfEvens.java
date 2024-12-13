package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα των άρτιων από το 2
 * μέχρι ένα όριο που δίνει ο χρήστης
 */

public class SumOfEvens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int i = 2;
        int sum = 0;

        System.out.println("Give a number");
        number = scanner.nextInt();

        while (i <= number) {
            sum += i;
            i+=2;
        }

        System.out.println("The sum of evens is " + sum);
    }
}
