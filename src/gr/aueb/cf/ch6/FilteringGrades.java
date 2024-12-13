package gr.aueb.cf.ch6;

public class FilteringGrades {

    public static void main(String[] args) {
        int[] grades = {4, 9, 9, 8, 7, 2, 1, 4, 10};
        int pass = 5;
        int[] passGrades = getPassGrades(grades, pass);
        printArray(passGrades);
    }

    public static int[] getPassGrades(int[] arr, int pass) {
        int count = 0;
        if (arr == null) return null;

        for (int item : arr ) {
            if (item >= pass) {
               count++;
            }
        }

        int[] arr2 = new int[count];
        int j = 0;

        for (int item : arr) {
            if (item >= pass) {
                arr2[j++] = item;
            }
        }

        return arr2;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
