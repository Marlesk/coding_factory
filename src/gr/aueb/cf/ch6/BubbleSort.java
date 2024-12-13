package gr.aueb.cf.ch6;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 4};
        bubleSort(arr);
        printArray(arr);

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int[] bubleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0  ; i--) {
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
