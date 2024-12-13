package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class IOIntDemo {

    public static void main(String[] args) throws FileNotFoundException {
        //Άνοιγμα αρχείου.
        File fint = new File("C:/Users/maria/Desktop/test/intIn.txt");
        Scanner in = new Scanner(fint);
        //Εγγραφή άλλου αρχείου που θα έχει τον μέσο όρο και το άθροισμα.
        File fout = new File("C:/Users/maria/Desktop/test/intOut.txt");
        PrintStream ps = new PrintStream(fout);
        //Δήλωση μεταβλητών
        String token;
        int num = 0;
        int sum = 0;
        int count = 0;
        double avg = 0.0;

        while (in.hasNextLine()) {
            token = in.next();
            if (isInt(token)) {
                num = Integer.parseInt(token);
                count++;
                sum += num;
            }
        }

        avg = (double) sum / count;
        ps.printf("Το άθροισμα είναι %d\n", sum);
        ps.printf(Locale.ENGLISH, "Ο μέσος όρος είναι %.2f", avg);

        in.close();
        ps.close();

    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
