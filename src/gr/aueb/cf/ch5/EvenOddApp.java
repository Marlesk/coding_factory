package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ελέγχει τον αριθμό που δίνει ο χρήστης αν είναι άρτιος
 * ή περιττός και εμφανίζει κατάλληλο μήνυμα
 */

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb = 0;

        System.out.println("Give a number:");
        numb = in.nextInt();

        System.out.println(numb + " is even " + isEven(numb));
        System.out.println(numb + " is not even " + isOdd(numb));
    }

    public static boolean isEven(int n) {
        return (n % 2 ==0);
    }

    public static boolean isOdd(int n) {
        return !isEven(n);
    }


}
