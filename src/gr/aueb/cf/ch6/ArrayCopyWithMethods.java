package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayCopyWithMethods {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] copyArray = new int[4];

        System.arraycopy(arr,0,copyArray,0,arr.length);
        printArray(arr);

        copyArray = Arrays.copyOf(arr, arr.length);
        printArray(copyArray);

        copyArray = Arrays.copyOfRange(arr, 0, arr.length);
        printArray(copyArray);
    }


    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println();
    }
}
