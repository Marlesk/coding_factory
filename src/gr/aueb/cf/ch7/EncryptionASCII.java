package gr.aueb.cf.ch7;

import java.util.Scanner;

public class EncryptionASCII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word;
        char c;
        char chPre;

        System.out.println("Γράψε μια λέξη ή πρόταση");
        word = in.nextLine();

        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            chPre = (char) (c - 1);

            System.out.printf("Χαρακτήρας: %c - ASCII τιμή: %d, Προηγούμενος χαρακτήρας %c - ASCII τιμή: %d\n", c, (int) c, chPre, (int) c - 1);
        }

    }
}
