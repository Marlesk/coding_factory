package gr.aueb.cf.ch6.exercises;

/**
 * 1. Αναζήτηση ενός στοιχείου στον πίνακα (Επιστρέφει τη θέση του στοιχείου)
 * 2. Φιλτράρισμα των ζυγών (επιστρέφει void, μόνο εκτύπωση των ζυγών)
 * 3. Mapping κάθε στοιχείου του πίνακα με το διπλάσιο (η μέθοδος επιστρέφει πίνακα)
 * 4. Έλεγχος αν υπάρχει έστω ένας θετικός αριθμός (η μέθοδος πρέπει να επιστρέφει boolean)
 * 5. Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικοί (η μέθοδος πρέπει να επιστρέφει boolean)
 */
public class MethodsExercises {

    public static void main(String[] args) {
        int[] arr = {25, 31, 10, 32};
        int value = 10;
        int position = getPositionArray(arr,value);
        int[] arr2 = doubleArray(arr);


        if (position == -1) {
            System.out.printf("Το στοιχείο %d δεν βρέθηκε", position);
        } else {
            System.out.printf("Το στοιχείο %d βρέθηκε στην θέση %d\n", value, position + 1);
        }

        printEvens(arr);
        System.out.println();

        printArray(arr2);
        System.out.println();

        System.out.println("Υπάρχει έστω και ένας θετικός αριθμός στον πίνακα? " + isPositiveElement(arr));

        System.out.println("Είναι όλα τα στοιχεία του πίνακα θετικά? " + isAllPositive(arr));


    }

    public static int getPositionArray(int[] arr, int value){
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void printEvens(int[] arr) {
        for (int el : arr) {
            if (el % 2 == 0){
                System.out.print(el + " ");
            }
        }
    }

    public static int[] doubleArray(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = 2 * arr[i];
        }
        return arr2;
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static boolean isPositiveElement(int[] arr) {
        for (int el : arr) {
            if (el > 0) return (el > 0);
        }
        return false;
    }

    public static boolean isAllPositive(int[] arr) {
        for (int el : arr) {
            if (el <= 0) {
                return false;
            }
        }
        return true;
    }




}
