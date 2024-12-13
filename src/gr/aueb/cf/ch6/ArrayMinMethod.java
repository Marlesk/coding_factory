package gr.aueb.cf.ch6;

/**
 * Μέθοδο που βρίσκει το ελάχιστο στοιχείο ενός πίνακα
 * Παίρνει ως παραμέτρους τον πίνακα arr
 * και τα low και high (start και end positions),
 * τον subarray δηλαδή μέσα στον οποίο ψάχνει
 */
public class ArrayMinMethod {

    public static void main(String[] args) {
        int[] arr = {7, 6, 2, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;

        minPosition = getMinPosistio(arr,0,arr.length - 1);

        System.out.printf("Το ελάχιστο στοιχείο είναι το %d και βρίσκεται στην θέση %d", arr[minPosition],minPosition+1);
    }

    public static int getMinPosistio(int[] arr,int low, int high) {
        int minPosition = low;
        int minValue;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Error in array dimensions");
            return -1;
        }

        minValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;


    }
}
