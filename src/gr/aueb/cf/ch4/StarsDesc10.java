package gr.aueb.cf.ch4;

/**
 * Εμφάνισε 10, 9, 8,…, 1 αστεράκια
 * Στην 1η γραμμή 10 αστεράκια, στην 2η σειρά 9 αστεράκια, κοκ,
 * μέχρι την 10η σειρά με 1 αστεράκι
 */

public class StarsDesc10 {

    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j=10; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println(" ");
        }
    }
}
