package gr.aueb.cf.ch4;

/**
 * Εμφάνισε 1, 2, 3,…, 10 αστεράκια
 * Εκτυπώστε 10 γραμμές όπου στην 1η γραμμή θα εκτυπώνει 1 αστεράκι,
 * στην 2η γραμμή 2 αστεράκια, κοκ.
 */

public class StarsAsc10 {

    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println(" ");
        }

    }
}
