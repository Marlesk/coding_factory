package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionWithStateTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
                System.out.println("Insert a numerator or denominator");
                numerator = in.nextInt();
                denominator = in.nextInt();

                if (isZero(denominator)) {
                    System.out.println("Insert a valid denominator");
                    continue;
                }
                result = numerator / denominator;
                System.out.printf("%d / %d = %d\n", numerator, denominator, result);
                if (result == 1) break;
        }
        System.out.println("Thanks for using up");
    }

    public static boolean isZero(int num) {
        return num == 0;
    }
}
