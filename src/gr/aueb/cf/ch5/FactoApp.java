package gr.aueb.cf.ch5;

import java.util.Scanner;

public class FactoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb = 0;
        int result = 0;

        System.out.println("Give a number");
        numb = in.nextInt();

        result = factorial(numb);

        System.out.printf("%d! = %d",numb,result);
    }

    /**
     * factorial for n
     * @param n the n number n!
     * @return   1*2*3*...*n
     */
    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
