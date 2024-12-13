package gr.aueb.cf.ch6.exercises;

import java.util.Scanner;

/**
 * Ζητήστε από τον χρήστη να εισάγει έξι ακεραίους από 1 έως 49
 * και ελέγξτε αν αυτή η εξάδα περνάει από τα παρακάτω φίλτρα
 * 1. Δεν έχει πάνω από 3 άρτιους
 * 2. Δεν έχει πάνω από 3 περιττούς
 * 3. Δεν έχει πάνω από 3 συνεχόμενους
 * 4. Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα
 * 5. Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα
 */
public class PredicatesExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        int first = 1;
        int last = 49;

        inputNumbers(arr, scanner);

        System.out.println("Πάνω από 3 άρτιους? " + moreThanThreeEvens(arr));
        System.out.println("Πάνω από 3 περιττούς? " + moreThanThreeOdds(arr));
        System.out.println("Πάνω από 3 συνεχόμενους? " + moreThanThreeConsecutive(arr));
        System.out.println("Πάνω από 3 αριθμούς με τον ίδιο λήγοντα? " + moreThanThreeWithSameEnding(arr));
        System.out.println("Πάνω από 3 αριθμούς στην ίδια δεκάδα? " + moreThanThreeWithSameDecade(arr, first,last));
    }

    public static void inputNumbers(int[] numbers, Scanner scanner) {
        System.out.println("Παρακαλώ εισάγετε έξι ακεραίους από 1 έως 49:");
            for (int i = 0; i < 6; i++) {
                System.out.print("Αριθμός " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();

                if (numbers[i] < 1 || numbers[i] > 49) {
                    System.out.println("Ο αριθμός πρέπει να είναι από 1 έως 49. Προσπαθήστε ξανά.");
                    i--;
                }
            }
    }


    public static boolean moreThanThreeEvens(int[] arr) {
        int evens = 0;

        for (int el : arr) {
            if (el % 2 == 0) {
                evens++;
            }
        }

        return (evens > 3);
    }

    public static boolean moreThanThreeOdds(int[] arr) {
        int odds = 0;

        for (int el : arr) {
            if (el % 2 != 0) {
                odds++;
            }
        }

        return (odds > 3);
    }

    public static boolean moreThanThreeConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 3; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i+2] - 2) && (arr[i] == arr[i+3] - 3)) {
                count++;
            }
        }

        return count >=1 ;

    }

    public static boolean moreThanThreeWithSameEnding(int[] arr) {
        int[] endings = new int[10];
        boolean hasSameEnding = false;

        for (int i = 0; i < arr.length; i++) {
            endings[arr[i] % 10] ++;
        }

        for (int el : endings) {
            if (el >= 4) {
                hasSameEnding = true;
                break;
            }
        }

        return hasSameEnding;
    }

    public static boolean moreThanThreeWithSameDecade(int[] arr, int firstNumb, int lastNumb) {
        int n = (firstNumb + lastNumb)/10;
        int[] decades = new int[n];
        boolean hasSameDecades = false;

        for (int i = 0; i < arr.length; i++) {
            decades[(arr[i] - 1) / 10] ++;
        }

        for (int el : decades) {
            if (el >= 4) {
                hasSameDecades = true;
                break;
            }
        }

        return hasSameDecades;
    }


}
