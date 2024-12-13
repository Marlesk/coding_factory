package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Μια μέθοδο που να δέχεται έναν ακέραιο αριθμό
 * και να επιστρέφει true αν ο αριθμός είναι πρώτος
 * και false αν δεν είναι
 */

public class IsPrimeApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb = 0;

        System.out.println("Δώσε έναν αριθμό:");
        numb = in.nextInt();

        System.out.printf("Ο αριθμός %d είναι πρώτος? %b",numb,isPrime(numb));
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++ ;
            }
        }
        return (count==2);
    }
}
