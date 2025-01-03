package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * Μετατρέπει σε κεφαλαία-πεζά εναλλάξ με το 1ο κεφαλαίο
 * π.χ. maria -> MaRiA
 */

public class UpperLowerCaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str;
        char ch;

        System.out.println("Δώσε μια συμβολοσειρά");
        str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (i % 2 == 0) {
                    ch = Character.toUpperCase(ch);
                } else {
                    ch = Character.toLowerCase(ch);
                }
            }
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
