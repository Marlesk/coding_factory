package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει a^b για Big Integers
 */

public class BigIntApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base;
        int power;
        BigInteger bigResult = new BigInteger("1");

        System.out.println("Give a base and power");
        base = in.nextInt();
        power = in.nextInt();

        for (int i=1; i<=power; i++) {
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        System.out.printf("%d^%d = %d",base,power,bigResult);
    }
}


