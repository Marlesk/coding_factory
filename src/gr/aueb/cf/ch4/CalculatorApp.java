package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζουμε τον 1ο αριθμό,
 * μετά το σύμβολο της πράξης και μετά τον 2ο αριθμό
 */

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = 0;
        int numb2 = 0;
        char operator = ' ';
        int result = 0;
        boolean isError = false;

        System.out.println("Δώσε 1ο αριθμό, δώσε το σύμβολο της πράξης, δώσε 2ο αριθμό");
        numb1 = scanner.nextInt();
        operator = scanner.next().charAt(0);
        numb2 = scanner.nextInt();

        switch (operator) {
            case '+':
                result = numb1 + numb2;
                break;
            case '-':
                result = numb1 - numb2;
                break;
            case '*':
                result = numb1 * numb2;
                break;
            case '/':
                if (numb2 !=0) {
                    result = numb1 / numb2;
                }
                break;
            case '%':
                if (numb2 !=0) {
                    result = numb1 % numb2;
                }
                break;
            default:
                System.out.println("Έδωσες λάθος operator");
                isError = true;
                break;
        }
    if (!isError) {
        System.out.printf("%d %c %d = %d", numb1, operator, numb2, result);
    }

    }
}
