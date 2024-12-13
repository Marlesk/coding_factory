package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BreakContinueApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number");
            num = scanner.nextInt();

            if (num==5) {
                continue;
            }
            sum += num;

            if (num==10) {
                break;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
