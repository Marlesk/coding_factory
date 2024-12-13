package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Έστω ότι έχουμε το 123 και θέλουμε να επιστρέφει 321
 */

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int num = 0;
        int digit = 0;
        int sum = 0;

        System.out.println("Give a number");
        inputNumber = scanner.nextInt();

        num = inputNumber;

        while (num > 0) {
            digit = num % 10;
            num /=  10;
            sum = sum * 10 + digit;

        }

        System.out.printf("%d is %d", inputNumber, sum);
    }
}
