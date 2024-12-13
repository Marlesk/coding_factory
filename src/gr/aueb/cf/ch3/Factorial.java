package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογισμός n! = 1*2*3*...*n
 */

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int i = 1;
        int factorial = 1;

        System.out.println("Give a number");
        inputNumber = scanner.nextInt();

        while (i <= inputNumber){
            factorial *= i;
            i++;
        }

        System.out.printf("%d! = %d", inputNumber,factorial);
    }
}
