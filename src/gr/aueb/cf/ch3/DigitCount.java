package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων
 */

public class DigitCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int count = 0;
        int inputNumber;

        System.out.println("Give a number");
        inputNumber = scanner.nextInt();
        number = inputNumber;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        System.out.printf("The digit of number %d is %d", inputNumber, count);
    }
}
