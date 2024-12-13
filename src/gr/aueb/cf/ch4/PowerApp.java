package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Δύναμη του a εις την b
 */

public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base;
        int power;
        int result = 1;

        System.out.println("Give a base and power");
        base = in.nextInt();
        power = in.nextInt();

        for (int i=1; i<=power; i++) {
            result *= base;
        }

        System.out.printf("%d^%d = %d",base,power,result);
    }
}
