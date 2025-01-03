package gr.aueb.cf.ch10.projects;

/**
 * Project 02
 */
public class ArrayApp {

    public static void main(String[] args) {
        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = MaxSumSubArray(arr1);

        int[] arr2 = {0, 1, 2, 3};
        int max2 = MaxSumSubArray(arr2);

        int[] arr3 = {-2, 1, 3};
        int max3 = MaxSumSubArray(arr3);

        int[] arr4 = {0};
        int max4 = MaxSumSubArray(arr4);

    }

    public static int MaxSumSubArray(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            System.out.println("Ο πίνακας είναι κενός ή έχει μόνο ένα στοιχείο. Δεν έχει υποπίνακα.");
            return -1;
        }

        int localMax = arr[0];
        int globalMax = arr[0];
        int start = 0;
        int end = 0;
        int temp = 0;

        for (int i = 1; i < arr.length; i++) {
            localMax = Math.max(localMax + arr[i], arr[i]);

            if (localMax > globalMax) {
                start = temp;
                end = i;
            }

            globalMax = Math.max(localMax, globalMax);

            if (arr[i] >= localMax) {
                temp = i;
            }
        }

        System.out.println("Το μέγιστο άθροισμα υποπίνακα είναι το: " + globalMax);
        printSubArray(arr, start, end);

        return globalMax;
    }

    public static void printSubArray(int[] arr, int start, int end) {
        System.out.print("Ο υποπίνακας με το μέγιστο άθροισμα είναι: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
