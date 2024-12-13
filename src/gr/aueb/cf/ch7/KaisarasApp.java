package gr.aueb.cf.ch7;

import java.util.Scanner;

public class KaisarasApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word;
        int key = 3;

        System.out.println("Γράψε μια λέξη ή πρόταση");
        word = in.nextLine();

        encryption(word,key);
        decryption(word,key);

    }

    public static void encryption(String word, int key) {
        char c;
        char chNext;
        String finalWord = "";

        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);

            if ((Character.isUpperCase(c) && (int) c + key > 90)
                    || (Character.isLowerCase(c) && (int) c + key > 122)) {
                   chNext = (char) (c + key - 26);
            } else if  (Character.isUpperCase(c) || Character.isLowerCase(c)) {
                chNext = (char) (c + key);
            } else {
                chNext = c;
            }

            finalWord = finalWord.concat(String.valueOf(chNext));
        }

        System.out.println("Αρχικό μήνυμα: " + word);
        System.out.println("Κωδικοποιημένο μήνυμα (Κρυπτογράφηση): " + finalWord);
    }



    public static void decryption(String word, int key) {
        char c;
        char chPre;
        String finalWord = "";

        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);

            if ((Character.isUpperCase(c) && (int) c + key < 65)
                    || (Character.isLowerCase(c) && (int) c + key < 97)) {
                chPre = (char) (c - key + 26);
            } else if (Character.isLowerCase(c) && (int) c - key < 97) {
                chPre = (char) (c - key + 26);
            } else if (Character.isUpperCase(c) || Character.isLowerCase(c)) {
                chPre = (char) (c - key);
            } else {
                chPre = c;
            }

            finalWord = finalWord.concat(String.valueOf(chPre));
        }

        System.out.println("Αρχικό μήνυμα: " + word);
        System.out.println("Κωδικοποιημένο μήνυμα (Αποκρυπτογράφηση): " + finalWord);
    }


}