package gr.aueb.cf.ch6;

/**
 * Αντικατάσταση στοιχείου με μέθοδο
 */
public class ReplaceElementApp {

    public static void main(String[] args) {
        int[] arr = {8, 12, 34, 8, 2};
        int position = 0;
        int oldValue = 12;
        int newValue = 10;

        printArray(arr);
        System.out.println();

        position = getPosition(arr, oldValue);

        if (position == -1){
            System.out.printf("Το στοιχείο %d δεν υπάρχει", oldValue);
        } else {
            replace(arr,oldValue,newValue);
            printArray(arr);
        }


    }

    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static void replace(int[] arr, int oldValue, int newValue) {
        int position;

        position = getPosition(arr,oldValue);
        if (position == -1) {
            return;
        }
        arr[position] = newValue;
    }
}
