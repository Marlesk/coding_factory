package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Μια μέθοδο που να δέχεται τρεις ακέραιους αριθμούς
 * και να επιστρέφει τον μεγαλύτερο από αυτούς
 */

public class MaxApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb1 = 0;
        int numb2 = 0;
        int numb3 = 0;

        System.out.println("Δώσε τρεις αριθμούς:");
        numb1 = in.nextInt();
        numb2 = in.nextInt();
        numb3 = in.nextInt();

        System.out.printf("Ο μεγαλύτερος αριθμός μεταξύ των %d, %d, %d είναι: %d",
                numb1,numb2,numb3,findMax(numb1,numb2,numb3));
    }

    public static int findMax(int n1, int n2, int n3) {
        return Math.max(Math.max(n1,n2),n3);
    }


}
