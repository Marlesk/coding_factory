package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα των ψηφίων ενός αριθμού
 */

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inpuNumber = 0;
        int sum = 0;
        int num = 0;

        System.out.println("Give a number");
        inpuNumber = scanner.nextInt();
        num = inpuNumber;

        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }

        System.out.printf("The sum of digits %d is %d", inpuNumber, sum);
    }
}
