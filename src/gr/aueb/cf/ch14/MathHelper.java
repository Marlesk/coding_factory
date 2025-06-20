package gr.aueb.cf.ch14;

public class MathHelper {

    private MathHelper() {

    }

    public static int Max(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Ο πίνακας δεν πρέπει να είναι null ή κενός.");
        }
        int maxValue = 0;
        int maxPosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }
        return maxValue;
    }

    public static int Min(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Ο πίνακας δεν πρέπει να είναι null ή κενός.");
        }
        int minValue = 0;
        int minPosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }
       return minValue;
    }

    public static double Average(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Ο πίνακας δεν πρέπει να είναι null ή κενός");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return  (double) (sum / arr.length);
    }



}
