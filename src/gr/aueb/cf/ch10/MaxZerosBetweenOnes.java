package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * Έστω η δυαδική αναπαράσταση ενός ακεραίου αριθμού. Βρείτε τα μέγιστο αριθμό
 * συνεχόμενων 0 που βρίσκονται ανάμεσα σε δύο 1.
 */
public class MaxZerosBetweenOnes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb;
        int result;

        System.out.println("Give a number");
        numb = in.nextInt();

        result = maxZeros(numb);

        System.out.println("Η μεγαλύτερη ακολουθία συνεχόμενων μηδενικών είναι: " + result);

    }


    public static int maxZeros(int numb) {
        String binaryString;
        binaryString = Integer.toBinaryString(numb);
        int count = 0;
        int max = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
