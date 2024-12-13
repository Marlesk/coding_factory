package gr.aueb.cf.ch6;

public class Reducing {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Total = " + getTotal(arr));
        System.out.printf("Avg = %.2f ", getAvg(arr));
    }

    public static int getTotal(int[] arr) {
        int total = 0;

        for (int el : arr) {
            total += el;
        }

        return total;
    }

    public static double getAvg(int[] arr) {

        return (double) getTotal(arr) / arr.length;
    }
}
