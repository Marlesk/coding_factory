package gr.aueb.cf.ch6;

public class ReplaceWithMethod {

    public static void main(String[] args) {
        int[] grades = {4,2,8,9,5};

        upScaleByOne(grades);
        printArray(grades);
    }

    public static void upScaleByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
