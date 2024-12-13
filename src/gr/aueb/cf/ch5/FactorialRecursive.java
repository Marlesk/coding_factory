package gr.aueb.cf.ch5;

import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb = 0;
        int result = 0;

        System.out.println("Give a number");
        numb = in.nextInt();

        result = factorial(numb);

        System.out.printf("%d! = %d",numb,result);
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }
}
