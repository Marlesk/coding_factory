package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * Ένας αριθμός Armstrong για μια δεδομένη βάση είναι ένας αριθμός που είναι ίσος
 * με το άθροισμα των ψηφίων του,
 * όπου κάθε ψηφίο έχει υψωθεί στη δύναμη του αριθμού των ψηφίων.
 */
public class ArmstrongApp {

    public static void main(String[] args) {
        int sum = 0;
        int numb;
        String s;
        int numberOfDigit;
        int originalNum;
        int digit;
        Scanner in = new Scanner(System.in);

        System.out.println("Δώσε έναν αριθμό:");
        numb = in.nextInt();
        originalNum = numb;
        numberOfDigit = String.valueOf(numb).length();


//        s = String.valueOf(numb);
//        numberOfDigit = s.length();

//        for (int i = 0; i < s.length(); i++) {
//            // αντικατατάσταση Integer.parseInt(String.valueOf(s.charAt(i)))
//            sum += (int) Math.pow(Character.getNumericValue(s.charAt(i)),numberOfDigit);
//        }

        while (numb != 0) {
            digit = numb % 10;
            sum += Math.pow(digit, numberOfDigit);
            numb /= 10;
        }

//        if (sum == numb) {
//            System.out.printf("Ο αριθμός %d είναι Armstrong αριθμός", numb);
//        } else {
//            System.out.printf("Ο αριθμός %d δεν είναι Armstrong αριθμός", numb);
//        }

        System.out.printf("Το %d %s Armstrong", originalNum,(sum==originalNum? "είναι" : "δεν είναι"));



    }
}
