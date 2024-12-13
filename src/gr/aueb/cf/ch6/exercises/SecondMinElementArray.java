package gr.aueb.cf.ch6.exercises;

/**
 * Πρόγραμμα που βρίσκει το 2ο μικρότερο στοιχείο ενός πίνακα
 * το στοιχείο δηλαδή που είναι αμέσως μεγαλύτερο από το ελάχιστο στοιχείο
 */
public class SecondMinElementArray {

    public static void main(String[] args) {
        int[] arr = {12, 51, 12, 32, 65};
        int[] minSecond = selectionSort(arr);
        printArray(minSecond);
    }

    public static int[] selectionSort(int[] arr) {
        int min = 0;
        if (arr.length < 2) return arr;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                System.out.print("Tο 2ο μικρότερο στοιχείο είναι το "+ arr[i] + " ");
                break;
            }
        }
    }
}
