package gr.aueb.cf.ch6;

/**
 * Βρίσκει το ελάχιστο στοιχείο και την θέση σε αταξινόμητο πίνακα
 */
public class ArrayMinApp {

    public static void main(String[] args) {
        int[] arr = {7, 6, 2, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }

        System.out.printf("Το ελάχιστο στοιχείο είναι το %d και βρίσκεται στην θέση %d", minValue,minPosition+1);
    }
}
