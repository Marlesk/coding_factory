package gr.aueb.cf.ch6.exercises;

/**
 * Μέθοδος που επιστρέφει τη θέση σε έναν πίνακα του μέγιστου στοιχείου του πίνακα
 */
public class MaxPositionApp {

    public static void main(String[] args) {
        int[] arr = {12, 15, 58, 32, 65};
        int low = 0;
        int high = arr.length;
        int maxPosition = getMaxPosition(arr,low,high) + 1;

        System.out.println("Max position: " + maxPosition);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        if (arr == null) return -1;
        if (low < 0 || high > arr.length) return -1;
        if (low > high) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = low; i < high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }

        return maxPosition;
    }
}
