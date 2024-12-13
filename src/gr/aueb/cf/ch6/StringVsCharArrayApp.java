package gr.aueb.cf.ch6;

/**
 * Εκτυπώνει όχι μόνο ολόκληρο τον πίνακα
 * αλλά και μέρος του πίνακα, από low μέχρι high
 */
public class StringVsCharArrayApp {

    public static void main(String[] args) {
        int[] ages = {45,30,35,48,58,56};
        printArray(ages,0,6);
        printArray(ages, 1, ages.length-2);
    }

    public static void printArray(int[] array, int low, int high) {
        if (low < 0 || high > array.length - 1) return;

        for (int i = low; i <= high; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
