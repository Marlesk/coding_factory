package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει αρχική τιμή, τελική τιμή και step
 * και το πρόγραμμα υπολογίζει πόσες φορές
 * εκτελείται το while
 */

public class GenericWhileApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstValue = 0;
        int lastValue = 0;
        int step = 0;
        int count = 0;

        System.out.println("Give a first value, last value and step");
        firstValue = in.nextInt();
        lastValue = in.nextInt();
        step = in.nextInt();

        while(firstValue <= lastValue){
            firstValue += step;
            count++;
        }

        System.out.println("The count is " + count);
    }
}
