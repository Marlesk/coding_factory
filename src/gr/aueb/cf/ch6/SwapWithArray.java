package gr.aueb.cf.ch6;

/**
 * Η swap αντιστρέφει τις τιμές των θέσεων arr[0]και arr[1]
 * Οι τιμές ανταλλάσσονται πραγματικά μιας
 * και τα περιεχόμενα του πίνακα περνάνε by reference
 */
public class SwapWithArray {

    public static void main(String[] args) {
        int[] arr = {5,12};
        printArray(arr);
        System.out.println();
        swap(arr);
        printArray(arr);

    }

    public static void swap(int[] arr) {
        if (arr.length!=2) return;

        int tmp;
        tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void printArray(int[] arr){
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
