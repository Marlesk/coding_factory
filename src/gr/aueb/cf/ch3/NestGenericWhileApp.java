package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NestGenericWhileApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstValue = 0;
        int lastValue = 0;
        int step = 0;
        int count = 0;
        int times= 1;

        while(times <= 3) {
            System.out.println("Give a first value, last value and step");
            firstValue = in.nextInt();
            lastValue = in.nextInt();
            step = in.nextInt();
            /*count = 0;*/

            while (firstValue <= lastValue) {
                firstValue += step;
                count++;
            }

            System.out.println("The count is " + count);
            times++;
        }
    }
}
