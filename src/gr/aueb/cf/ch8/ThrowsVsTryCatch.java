package gr.aueb.cf.ch8;

import java.io.IOException;

public class ThrowsVsTryCatch {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a character: ");
        int input = System.in.read(); // Διαβάζει έναν χαρακτήρα από την είσοδο
        System.out.println("You entered: " + (char) input);

//        try {
//            System.out.println("Enter a character: ");
//            int input = System.in.read(); // Διαβάζει έναν χαρακτήρα από την είσοδο
//            System.out.println("You entered: " + (char) input);
//        } catch (IOException e) {
//            System.out.println("An error occurred while reading input."); or
//            throw new RuntimeException(e);
//        }

    }


}
