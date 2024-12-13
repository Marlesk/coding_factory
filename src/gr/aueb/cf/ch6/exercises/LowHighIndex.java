package gr.aueb.cf.ch6.exercises;

/**
 * Έστω ένας ταξινομημένος πίνακας με επαναλαμβανόμενα στοιχεία.
 * Μέθοδος int[] getLowAndHighIndexOf(int[] arr, int key) που να υπολογίζει
 * και να επιστρέφει τα low και high index ενός πίνακα arr,
 * για ένα ακέραιο key που λαμβάνει ως παράμετρο.
 */
public class LowHighIndex {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;
        int[] keys = getLowAndHighIndexOf(arr, key);

        System.out.printf("Low: %d, High: %d", keys[0], keys[1]);
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int count = 0;

        for (int el : arr) {
            if (el == key) {
                count++;
            }
        }

        int[] arrkey = new int[count];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                arrkey[j] = i;
                j++;
            }
        }


        int low = arrkey[0];
        int high = arrkey[arrkey.length-1];
        int[] keys = {low, high};

        return keys;

    }
}
