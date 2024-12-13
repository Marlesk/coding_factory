package gr.aueb.cf.ch6;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 9};
        int low = 0;
        int high = arr.length - 1;
        int position = -1;

        position = binarySearch(arr, low, high, 7);

        if (position == -1) {
            System.out.println("Value wan not found");
        } else {
            System.out.println("Value was found in position "+ (position + 1));
        }

    }

    public static int binarySearch(int[] arr,int low, int high, int value) {
        int mid = 0;

        if (arr == null) return -1;
        if (low < 0 || high >= arr.length) return -1;
        if (low > high) return -1;

        mid = (low + high) / 2;

        if (value == arr[mid]) {
            return mid;
        }

        if (value < arr[mid]) {
            return binarySearch(arr, low, mid-1, high);
        }
        else {
            return binarySearch(arr, mid + 1, high, value);
        }

    }
}
