package gr.aueb.cf.ch6;

/**
 * Κάνουμε συγκρίσεις κάθε στοιχείου του πίνακα
 * με το στοιχείο που αναζητούμε
 */
public class ArraySearchApp {

    public static void main(String[] args) {
        final int KEY = 10;
        int[] arr = {1, 8, 9, 5, 10, 15};
        boolean keyIsFound = false;

        for (int el : arr) {
            if (el == KEY) {
                keyIsFound = true;
                break;
            }
        }

        if (keyIsFound) {
            System.out.println("Key was found");
        } else {
            System.out.println("Key was not found");
        }
    }
}

