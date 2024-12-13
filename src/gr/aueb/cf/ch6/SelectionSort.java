package gr.aueb.cf.ch6;

/**
 * Ταξινόμηση πίνακα
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 4};
        int min = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }

        for (int el : arr) {
            System.out.print(el + " ");
        }

    }

}
