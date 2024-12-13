package gr.aueb.cf.ch6;

public class SelectionSortSwap {

    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 4};
        selectionSort(arr);
        printArray(arr);
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            int minValue = arr[minPosition];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minPosition = j;
                }
            }
            swap(arr,i,minPosition);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

}
