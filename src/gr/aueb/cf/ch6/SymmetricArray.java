package gr.aueb.cf.ch6;

public class SymmetricArray {

    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 3, 7};

        System.out.println("Array is symmetric "+ isArraySymmetric(arr));
    }

    public static boolean isArraySymmetric(int[] arr) {
        int n = arr.length - 1;
        boolean isSymetric = true;

        for (int i = 0; i < n / 2; i++) {
                if (arr[i] != arr[n - i]) {
                    isSymetric = false;
                    break;
                }
        }
        return isSymetric;
    }
}
