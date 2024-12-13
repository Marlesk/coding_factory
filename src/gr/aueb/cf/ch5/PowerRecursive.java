package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerRecursive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;

        System.out.println("Give base and power");
        base = in.nextInt();
        power = in.nextInt();

        System.out.printf("%d^%d = %d", base,power,pow(base,power));

    }

    public static int pow(int a, int n) {
        if (n==0) {
            return 1;
        } else {
            return n * pow(a,n-1);
        }
    }
}
