package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει εάν έχει δικαίωμα ψήφου κάποιος
 * Δικαίωμα ψήφου έχουν όσοι είναι >=18.
 */

public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        boolean IsEligible = false;
        final int VOTE_AGE = 18;

        System.out.println("Give your age");
        age = in.nextInt();

        IsEligible = (age >= VOTE_AGE);

        System.out.println("You are eligible?" + IsEligible);


    }

}
