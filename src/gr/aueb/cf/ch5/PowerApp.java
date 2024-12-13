package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long base = 0;
        long power = 0;

        System.out.println("Give base and power");
        base = in.nextLong();
        power = in.nextLong();

        System.out.printf("%d^%d = %d", base,power,pow(base,power));
    }

    public static long pow(long a, long n) {
        return (long) Math.pow(a,n);
    }
}
