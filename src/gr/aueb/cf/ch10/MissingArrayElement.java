package gr.aueb.cf.ch10;

/**
 * Έστω ένας array με N στοιχεία από 1 έως N+1.
 * Γράψτε ένα αποδοτικό αλγόριθμο που βρίσκει το στοιχείο που λείπει.
 * Για παράδειγμα, αν έχουμε [1, 2, 3, 5] ο αλγόριθμος θα πρέπει να επιστρέψει 4.
 */
public class MissingArrayElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int missingNumber = findMissingNumber(arr);
        System.out.println("Το στοιχείο που λείπει είναι: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Ο αριθμός των στοιχείων πρέπει να είναι N+1
        // Υπολογίζουμε το άθροισμα των πρώτων N+1 αριθμών
        int expectedSum = (n * (n + 1)) / 2;

        // Υπολογίζουμε το άθροισμα των στοιχείων του πίνακα
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Η διαφορά θα μας δώσει το στοιχείο που λείπει
        return expectedSum - actualSum;
    }
}
