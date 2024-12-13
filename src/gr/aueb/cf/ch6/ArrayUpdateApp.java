package gr.aueb.cf.ch6;

/**
 * Βρίσκει μια τιμή και την διπλασιάζει
 */
public class ArrayUpdateApp {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 15, 10};
        final int KEY = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == KEY) {
                arr[i] = KEY * 2;
            }
        }

        for (int el : arr) {
            System.out.print(el + " ");
        }

    }


}
