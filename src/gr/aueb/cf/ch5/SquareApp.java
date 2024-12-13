package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Mια μέθοδο που να δέχεται έναν ακέραιο αριθμό
 * ως παράμετρο και να επιστρέφει το τετράγωνό του
 */

public class SquareApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb = 0;

        System.out.println("Δώσε έναν αριθμό:");
        numb = in.nextInt();

        System.out.printf("%d^2 = %d", numb,square(numb));

    }

    public static int square(int n) {
       return (int) Math.pow(n,2);
    }



}
