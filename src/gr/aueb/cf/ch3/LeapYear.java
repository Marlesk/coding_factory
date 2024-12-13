package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Θα ζητάει από τον χρήστη να δώσει ένα έτος από το πληκτρολόγιο,
 * και να εμφανίζει στην οθόνη αν το έτος αυτό είναι δίσεκτο ή όχι.
 * Δίσεκτο είναι ένα έτος αν έχει 366 ημέρες, αντί 365.
 */

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean IsLeapYear = false;

        System.out.println("Give a year");
        year = scanner.nextInt();

        IsLeapYear = (year % 4 ==0) && (year % 100 !=0 || year % 400 == 0);

        System.out.printf("%d is a leap year ? %b ", year, IsLeapYear);
    }




}
