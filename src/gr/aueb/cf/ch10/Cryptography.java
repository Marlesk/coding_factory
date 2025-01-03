package gr.aueb.cf.ch10;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Κωδικοποίησε τον 1ο χαρακτήρα του μηνύματος με την
 * ακέραια τιμή που αντιστοιχεί σε αυτόν (από τον κώδικα ASCII)
 * Κωδικοποίησε του επόμενους χαρακτήρες: (α) προσθέτοντας την ακέραια ASCII τιμή του καθένα
 * από αυτούς με τον κωδικό του προηγούμενού του,
 * (β) παίρνοντας το υπόλοιπο της διαίρεσης του αθροίσματος αυτού διά μία σταθερά
 * Η σταθερά ονομάζεται κλειδί (key) κρυπτογράφησης και (υποτίθεται πως) είναι μυστική
 * Υποθέτουμε πως τα μηνύματα τελειώνουν με τον χαρακτήρα #
 * Γράψτε ένα πρόγραμμα java που να υλοποιεί τον αλγόριθμο κρυπτογράφησης έτσι ώστε το
 * κωδικοποιημένο μήνυμα που προκύπτει να είναι μία ακολουθία ακεραίων που τελειώνει με -1
 * Γράψτε και τον αλγόριθμο αποκρυπτογράφησης που λαμβάνει ως είσοδο μία
 * ακολουθία ακεραίων που τελειώνει με -1 και υπολογίζει το αρχικό μήνυμα
 */
public class Cryptography {

    public static void main(String[] args) {
        final int KEY = 128;
        String s = "Apollo 17 was the final mission of NASA's Apollo program.#";

        String s1 = encrypt(KEY,s).toString();
        System.out.println(s1);

        String s2 = decrypt(KEY,encrypt(KEY,s)).toString();
        System.out.println(s2);


    }

    public static ArrayList<Integer> encrypt(int key, String s) {
        char ch;
        int cr;
        char prev;
        ArrayList<Integer> list = new ArrayList<>();

        ch = s.charAt(0);
        cr = cipher(ch,-1,key);
        prev = s.charAt(0);
        list.add(cr);

        for (int i = 1; i < s.length() - 1; i++) {
            ch = s.charAt(i);
            cr = cipher(ch,prev,key);
            prev = s.charAt(i-1);
            list.add(cr);
        }
        list.add(-1);

        return list;
    }

    public static int cipher(int ch, int prev, int key) {
        if (prev == -1) return ch;

        return (ch + prev) % key;
    }

    public static ArrayList<Character> decrypt(int key, ArrayList<Integer> encrypt) {
        int token;
        int i;
        int prevToken;
        ArrayList<Character> list = new ArrayList<>();

        prevToken = decipher(encrypt.get(0),-1,key);
        list.add((char) prevToken);

        i = 1;
        while ((token = encrypt.get(i))!= -1) {
            list.add(decipher(token,prevToken,key));
            prevToken = token;
            i++;
        }
        return list;

    }

    public static char decipher(int ch, int prev, int key) {
        int m;

        if (prev == -1) return (char) ch;

        m = (ch + prev + key) % key;

        return (char) m;
    }
}
