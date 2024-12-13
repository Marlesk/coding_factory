package gr.aueb.cf.ch6;

/**
 * η μέθοδος να επιστρέφει τη θέση του στοιχείου στον πίνακα
 * ή -1 αν το στοιχείου δεν βρεθεί
 */
public class SearchArrayWithMethod {

    public static void main(String[] args) {
        int[] arr = {5,74,35,15,8,32};
        int value = 35;
        int position = 0;

        position = SearchArray(arr,value);

        if (position == -1){
            System.out.printf("Το στοιχείο %d δεν βρέθηκε", value);
        } else {
            System.out.printf("Το στοιχείο %d βρέθηκε στην θέση %d ", value, position+1);
        }
    }

    public static int SearchArray(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
