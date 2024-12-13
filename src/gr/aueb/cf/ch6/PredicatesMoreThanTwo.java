package gr.aueb.cf.ch6;

/**
 * Ελέγχει τον πίνακα για το αν περιέχει περισσότερους από δύο άρτιους
 * Ελέγχει τον πίνακα για το αν περιέχει περισσότερους από δύο περιττούς
 * Ελέγχει τον πίνακα για το αν περιέχει περισσότερους
 * από δύο συνεχόμενους αριθμούς (π.χ. 5, 6, 7 – τρεις συνεχόμενοι)
 * Ελέγχει τον πίνακα για το αν περιέχει περισσότερους
 * από δύο αριθμούς με ίδιο λήγοντα
 */
public class PredicatesMoreThanTwo {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 6, 2, 10};
        int[] arr2 = {1, 3, 5, 7, 10};
        int[] arr3 = {1, 5, 6, 7, 9, 10};
        int[] arr4 = {1, 11, 21, 31, 8, 9};

        System.out.println("More than two Evens?" + moreThanTwoEvens(arr));
        System.out.println("More than two Evens?" + moreThanTwoEvens(arr2));

        System.out.println("More than two Evens?" + moreThanTwoOdds(arr));
        System.out.println("More than two Evens?" + moreThanTwoOdds(arr2));

        System.out.println("More than two Consecutive?" + moreThanTwoConsecutive(arr3));
        System.out.println("More than two Consecutive?" + moreThanTwoConsecutive(arr));

        System.out.println("More than two has same Endings?" + moreThanTwoWithSameEnding(arr4));

    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;
        if (arr == null) return false;

        for (int el : arr) {
            if (el % 2 == 0) {
                count++;
            }
        }

        return (count > 2);
    }

    public static boolean moreThanTwoOdds(int[] arr) {
        int count = 0;
        if (arr == null) return false;

        for (int el : arr) {
            if (el % 2 != 0) {
                count++;
            }
        }

        return (count > 2);
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;
        if (arr == null) return false;

        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i+2] - 2)) {
                count++;
            }
        }

        return count >=1 ;

    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        if (arr == null) return false;
        int[] endings = new int[10];
        boolean hasSameEnding = false;

        for (int i = 0; i < arr.length; i++) {
            endings[arr[i] % 10] ++;
            }

        for (int el : endings) {
            if (el >= 3) {
                hasSameEnding = true;
                break;
            }
        }

        return hasSameEnding;
    }

}
