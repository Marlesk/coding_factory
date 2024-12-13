package gr.aueb.cf.ch6;

public class Mapping {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 75, 8, 10};
        int[] arr2;
        arr2 = mapToDouble(arr);

        printArray(arr2);
    }

//    public static void mapToDouble(int[] arr) {
//        for (int el : arr) {
//            System.out.print(el * 2 + " ");
//        }
//    }

    public static int[] mapToDouble(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] * 2;
        }
        return arr2;
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

}
