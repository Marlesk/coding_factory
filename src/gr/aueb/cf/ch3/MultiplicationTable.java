package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης θα δώσει έναν αριθμό και
 * θα υπολογίζει την προπαίδεια του απο το 1-10
 */

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;
        int i = 1;
        int multi = 0;

        System.out.println("Give a number");
        inputNumber = scanner.nextInt();

        while (i <=10) {
            multi = i * inputNumber;
            System.out.printf("%d * %2d = %2d \n",inputNumber, i,  multi);
            i++;

        }
    }
}
