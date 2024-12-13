package gr.aueb.cf.ch6;

/**
 * Ο αλγόριθμος θεωρεί αρχική ελάχιστη τιμή
 * ένα πολύ μεγάλο ακέραιο (Integrer.MAX_VALUE)
 */
public class ArrayMinApp2 {

    public static void main(String[] args) {
        int[] arr = {7, 6, 2, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }

        System.out.printf("Το ελάχιστο στοιχείο είναι το %d και βρίσκεται στην θέση %d", minValue,minPosition+1);
    }
}
