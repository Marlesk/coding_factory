package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * ο χρήστης θα δίνει το πλήθος των stars,έστω n
 * από 1 έως n
 */

public class StarsNDesc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Δώσε πλήθος των stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
