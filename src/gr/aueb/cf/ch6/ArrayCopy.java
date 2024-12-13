package gr.aueb.cf.ch6;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] copyArray = new int[4];

        for (int i = 0; i < arr.length; i++) {
            copyArray[i] = arr[i];
        }

        copyArray[2] = 10;

        for (int el : copyArray) {
            System.out.print(el + " ");
        }

        System.out.println();

        for (int el : arr) {
            System.out.print(el + " ");
        }


    }
}
