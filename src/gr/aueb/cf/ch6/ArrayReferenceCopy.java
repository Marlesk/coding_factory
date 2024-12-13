package gr.aueb.cf.ch6;

public class ArrayReferenceCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copyArr = arr;

        for (int el : copyArr) {
            System.out.print(el + " ");
        }

        System.out.println();

        copyArr[4] = 100;

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
