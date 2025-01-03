package gr.aueb.cf.ch10;

/**
 * Έστω ένας πίνακας με περιττό αριθμό στοιχείων, όπου όλα τα στοιχεία είναι σε ζεύγη εκτός από ένα αριθμό.
 * Γράψτε μία efficient μέθοδο που να βρίσκει και να επιστρέφει αυτόν τον αριθμό.
 * Αν για παράδειγμα ο πίνακας είναι ο [1, 2, 3, 4, 3, 2, 1] πρέπει να επιστραφεί το 4.
 */
public class NotPaired2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int unique = findUniqueNumber(arr);

        System.out.println("Ο μοναδικός αριθμός είναι: " + unique);
    }

    public static int findUniqueNumber(int[] arr) {
        int result = 0;

        // Εφαρμόζουμε XOR σε όλα τα στοιχεία του πίνακα
        //a⊕a=0: Η XOR ενός αριθμού με τον ίδιο τον αριθμό επιστρέφει 0.
        //a⊕0=a: Η XOR ενός αριθμού με το 0 επιστρέφει τον ίδιο αριθμό.
        // a⊕b=a+b: Η XOR ενός αριθμού με άλλον αριθμό επιστρέφει το άθροισμά τους.

        for (int num : arr) {
            result ^= num;
        }

        return result;
    }
}
