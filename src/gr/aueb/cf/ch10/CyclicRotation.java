package gr.aueb.cf.ch10;

/**
 * Δοθέντος ενός πίνακα με ακεραίους, θέλουμε μία μέθοδο που να μεταθέτει δεξιά κατά n
 * θέσεις όλα τα στοιχεία του πίνακα.
 * Τα τελευταία στοιχεία μετακινούνται στην αρχή του πίνακα.
 * Για παράδειγμα, ένα shift κατά 2 του πίνακα [1,2,3,4,5] δίνει [4, 5, 1, 2, 3]
 */
public class CyclicRotation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int shift = 2;
        int[] rotated = doCircularShiftBy(arr, shift);

        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }

    }

    public static int[] doCircularShiftBy(int[]arr,int n) {
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + n) % arr.length] = arr[i];
        }
        return rotated;
    }
}
