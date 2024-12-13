package gr.aueb.cf.ch6.exercises;

/**
 * Αναπτύξτε μία εφαρμογή που να διαβάζει και
 * να εκτυπώνει τον μέγιστο αριθμό αυτοκινήτων που είναι σταθμευμένα το ίδιο χρονικό διάστημα.
 */
public class CarParkingApp {

    public static void main(String[] args) {
        int[][] times = {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        System.out.println("Ο μέγιστος αριθμός αυτοκινήτων που είναι σταθμευμένα " +
                "το ίδιο χρονικό διάστημα είναι: " + getMaxCarsAtSameTime(times));
    }

    public static int getMaxCarsAtSameTime(int[][] arr) {
        int n = arr.length;
        int[][] times = new int[n * 2][2];
        int currentCars = 0;
        int maxCars = 0;

        for (int i = 0; i < n; i++) {
                times[i * 2][0] = arr[i][0];
                times[i * 2][1] = 1;
                times[i * 2 + 1][0] = arr[i][1];
                times[i * 2 + 1][1] = 0;
        }



        int[][] cars = selectionSort(times);

        for (int i = 0; i < 2 * n; i++) {
            if (cars[i][1] == 1) {
                currentCars++; // Άφιξη
            } else {
                currentCars--; // Αναχώρηση
            }
            maxCars = Math.max(maxCars, currentCars); // Ενημέρωση του μέγιστου αριθμού
        }

        return maxCars;

    }

    public static int[][] selectionSort(int[][] arr) {
        int min = 0;
        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++){
                if (arr[i][0] > arr[j][0]) {
                    min = arr[j][0];
                    arr[j][0] = arr[i][0];
                    arr[i][0] = min;
                    value = arr[j][1];
                    arr[j][1] = arr[i][1];
                    arr[i][1] = value;
                }

            }
        }

        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }


}
