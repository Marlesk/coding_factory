package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα των 10 πρώτων αριθμών
 * 1-10
 */
public class Sum10 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 10){
            sum += i;
            i++;
        }

        System.out.println("The sum of 1-10 is:" + sum);
    }
}
