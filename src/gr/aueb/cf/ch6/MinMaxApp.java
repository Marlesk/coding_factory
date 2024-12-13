package gr.aueb.cf.ch6;

public class MinMaxApp {

    public static void main(String[] args) {
        int[] arr = {7, 6, 2, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;
        int maxPosition = 0;

        minPosition = getMinPosistion(arr);
        maxPosition = getMaxPosistion(arr);

        System.out.printf("Το ελάχιστο στοιχείο είναι το %d και βρίσκεται στην θέση %d\n", arr[minPosition],minPosition+1);
        System.out.printf("Το μέγιστο στοιχείο είναι το %d και βρίσκεται στην θέση %d", arr[maxPosition],maxPosition+1);

    }

    public static int getMinPosistion(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }

        return minPosition;
    }

    public static int getMaxPosistion(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }

        return maxPosition;
    }


}
